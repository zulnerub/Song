import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AuthorTests {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private Author testAuthor;

    @Before
    public void init(){
        System.setOut(new PrintStream(out));
        this.testAuthor = new Author("Sample Author", 10);
    }

    @Test
    public void shouldPrintAuthorNameAndAgeCorrectly(){
        testAuthor.printAuthorNameAndAge();
        Assert.assertEquals("Sample Author - 10", out.toString().trim());
    }

    @Test
    public void shouldListAuthorWithoutSongsCorrectly(){

        Assert.assertEquals("Author name: Sample Author, List of songs:", testAuthor.listAuthorWithSongs().trim());
    }
}
