SUMMARY = "Easy, automatic, specification-based tests"
DESCRIPTION = "This module provides a simple (yet full featured) interface to LectroTest, \
an automated, specification-based testing system for Perl. To use it, \
declare properties that specify the expected behavior of your software. \
LectroTest then checks your software to see whether those properties hold. \
 \
Declare properties using the 'Property' function, which takes a block of \
code and promotes it to a Test::LectroTest::Property: \
 \
    Property { \
         \
        MyModule::my_function( $x, $y ) >= 0; \
    }, name => 'my_function output is non-negative' ; \
 \
The first part of the block must contain a generator-binding declaration. \
For example: \
 \
         \
 \
(Note the special bracketing, which is required.) This particular binding \
says, 'For all integers _x_ and _y_.' (By the way, you aren't limited to \
integers. LectroTest also gives you booleans, strings, lists, hashes, and \
more, and it lets you define your own generator types. See \
Test::LectroTest::Generator for more.) \
 \
The second part of the block is simply a snippet of code that makes use of \
the variables we bound earlier to test whether a property holds for the \
piece of software we are testing: \
 \
        MyModule::my_function( $x, $y ) >= 0; \
 \
In this case, it asserts that 'MyModule::my_function($x,$y)' returns a \
non-negative result. (Yes, '$x' and '$y' refer to the same _x_ and _y_ that \
we bound to the generators earlier. LectroTest automagically loads these \
lexically bound Perl variables with values behind the scenes.) \
 \
*Note:* If you want to use testing assertions like 'ok' from Test::Simple \
or 'is', 'like', or 'cmp_ok' from Test::More (and the related family of \
Test::Builder-based testing modules), see Test::LectroTest::Compat, which \
lets you mix and match LectroTest with these modules. \
 \
Finally, we give the whole Property a name, in this case 'my_function \
output is non-negative.' It's a good idea to use a meaningful name because \
LectroTest refers to properties by name in its output. \
 \
Let's take a look at the finished property specification: \
 \
    Property { \
         \
        MyModule::my_function( $x, $y ) >= 0; \
    }, name => 'my_function output is non-negative' ; \
 \
It says, 'For all integers _x_ and _y_, we assert that my_function's output \
is non-negative.' \
 \
To check whether this property holds, simply put it in a Perl program that \
uses the Test::LectroTest module. (See the SYNOPSIS for an example.) When \
you run the program, LectroTest will load the property (and any others in \
the file) and check it by running random trials against the software you're \
testing. \
 \
*Note:* If you want to place LectroTest property checks into a test plan \
managed by Test::Builder-based modules such as Test::Simple or Test::More, \
see Test::LectroTest::Compat. \
 \
If LectroTest is able to 'break' your software during the property check, \
it will emit a counterexample to your property's assertions and stop. You \
can plug the counterexample back into your software to debug the problem. \
(You might also want to add the counterexample to a list of regression \
tests.) \
 \
A successful LectroTest looks like this: \
 \
  1..1 \
  ok 1 - 'my_function output is non-negative' (1000 attempts) \
 \
On the other hand, if you're not so lucky: \
 \
  1..1 \
  not ok 1 - 'my_function output is non-negative' falsified \\ \
      in 324 attempts"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.5001"

RPM_NAME = "perl-Test-LectroTest-0.5001-1.19.noarch.rpm"
RPM_HASH = "abba719b067f8d0266a01aedb1dc905d61334e41645b6478d4f67231cc6308741d1e1f722a9d7f70309e57048454c138c33a341de61949f3168209d687f77ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LectroTest \
perl-Test--LectroTest--Compat \
perl-Test--LectroTest--FailureRecorder \
perl-Test--LectroTest--Generator \
perl-Test--LectroTest--Property \
perl-Test--LectroTest--TestRunner \
perl-Test--LectroTest--TestRunner--results \
perl-Test--LectroTest--TestRunner--testcontroller \
perl-Test-LectroTest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
