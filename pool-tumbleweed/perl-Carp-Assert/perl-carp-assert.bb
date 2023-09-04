SUMMARY = "Executable comments"
DESCRIPTION = "    'We are ready for any unforseen event that may or may not \
    occur.' \
        - Dan Quayle \
 \
Carp::Assert is intended for a purpose like the ANSI C library at \
http://en.wikipedia.org/wiki/Assert.h. If you're already familiar with \
assert.h, then you can probably skip this and go straight to the FUNCTIONS \
section. \
 \
Assertions are the explicit expressions of your assumptions about the \
reality your program is expected to deal with, and a declaration of those \
which it is not. They are used to prevent your program from blissfully \
processing garbage inputs (garbage in, garbage out becomes garbage in, \
error out) and to tell you when you've produced garbage output. (If I was \
going to be a cynic about Perl and the user nature, I'd say there are no \
user inputs but garbage, and Perl produces nothing but...) \
 \
An assertion is used to prevent the impossible from being asked of your \
code, or at least tell you when it does. For example: \
 \
     \
    sub my_sqrt { \
        my($num) = shift; \
 \
         \
        assert($num >= 0); \
 \
        return sqrt $num; \
    } \
 \
The assertion will warn you if a negative number was handed to your \
subroutine, a reality the routine has no intention of dealing with. \
 \
An assertion should also be used as something of a reality check, to make \
sure what your code just did really did happen: \
 \
    open(FILE, $filename) || die $!; \
    @stuff = <FILE>; \
    @stuff = do_something(@stuff); \
 \
     \
    assert(@stuff > 0); \
 \
The assertion makes sure you have some @stuff at the end. Maybe the file \
was empty, maybe do_something() returned an empty list... either way, the \
assert() will give you a clue as to where the problem lies, rather than 50 \
lines down at when you wonder why your program isn't printing anything. \
 \
Since assertions are designed for debugging and will remove themelves from \
production code, your assertions should be carefully crafted so as to not \
have any side-effects, change any variables, or otherwise have any effect \
on your program. Here is an example of a bad assertation: \
 \
    assert($error = 1 if $king ne 'Henry');  # Bad! \
 \
It sets an error flag which may then be used somewhere else in your \
program. When you shut off your assertions with the $DEBUG flag, $error \
will no longer be set. \
 \
Here's another example of *bad* use: \
 \
    assert($next_pres ne 'Dan Quayle' or goto Canada);  # Bad! \
 \
This assertion has the side effect of moving to Canada should it fail. This \
is a very bad assertion since error handling should not be placed in an \
assertion, nor should it have side-effects. \
 \
In short, an assertion is an executable comment. For instance, instead of \
writing this \
 \
     \
    $life = begin_life(); \
 \
you'd replace the comment with an assertion which *enforces* the comment. \
 \
    $life = begin_life(); \
    assert( $life =~ /!$/ );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-Carp-Assert-0.22-1.3.noarch.rpm"
RPM_HASH = "f05745e3ca7912415c8b8548535839af9f8f269ff887c77708c1f8f3fd28ab57d481093550b5326a142bb15c2b2506cd8f3eb9b310ad2af18b514490d7953a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Assert \
perl-Carp-Assert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
