SUMMARY = "Data Driven Testing Framework"
DESCRIPTION = "Testing is usually the ugly part of Perl module authoring. Perl gives you a \
standard way to run tests with Test::Harness, and basic testing primitives \
with Test::More. After that you are pretty much on your own to develop a \
testing framework and philosophy. Test::More encourages you to make your \
own framework by subclassing Test::Builder, but that is not trivial. \
 \
Test::Base gives you a way to write your own test framework base class that \
_is_ trivial. In fact it is as simple as two lines: \
 \
    package MyTestFramework; \
    use Test::Base -Base; \
 \
A module called 'MyTestFramework.pm' containing those two lines, will give \
all the power of Test::More and all the power of Test::Base to every test \
file that uses it. As you build up the capabilities of 'MyTestFramework', \
your tests will have all of that power as well. \
 \
'MyTestFramework' becomes a place for you to put all of your reusable \
testing bits. As you write tests, you will see patterns and duplication, \
and you can 'upstream' them into 'MyTestFramework'. Of course, you don't \
have to subclass Test::Base at all. You can use it directly in many \
applications, including everywhere you would use Test::More. \
 \
Test::Base concentrates on offering reusable data driven patterns, so that \
you can write tests with a minimum of code. At the heart of all testing you \
have inputs, processes and expected outputs. Test::Base provides some clean \
ways for you to express your input and expected output data, so you can \
spend your \
 \
      time focusing on that rather than your code scaffolding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.89"

RPM_NAME = "perl-Test-Base-0.89-1.19.noarch.rpm"
RPM_HASH = "684a8269aed293f1b3efc32eec4b433b49765c27d216d0ad4dcad8c53896b7ef51760695c99769ff86c4315124e79c2af9b91bfa321ac4ae61a4cd4bd435067b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Base \
perl-Test--Base--Block \
perl-Test--Base--Filter \
perl-Test--Base--Handle \
perl-Test-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Spiffy \
perl-Test--More"

inherit rpm
