SUMMARY = "Perl extension for emulating troublesome interfaces"
DESCRIPTION = "It's a simple program that doesn't use any other modules, and those are \
easy to test. More often, testing a program completely means faking up \
input to another module, trying to coax the right output from something \
you're not supposed to be testing anyway. \
 \
Testing is a lot easier when you can control the entire environment. With \
Test::MockObject, you can get a lot closer. \
 \
Test::MockObject allows you to create objects that conform to particular \
interfaces with very little code. You don't have to reimplement the \
behavior, just the input and the output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20200122"

RPM_NAME = "perl-Test-MockObject-1.20200122-1.14.noarch.rpm"
RPM_HASH = "413b4266e47fbcf9b260f0da02add92c1efb8f1588105a24650fdec3443ca2c1e68685b48a15d7ac9c1f2e9f8299caabb53dbe7bd7c983b7afa5b7b7bf920569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockObject \
perl-Test--MockObject--Extends \
perl-Test-MockObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-UNIVERSAL--can \
perl-UNIVERSAL--isa"

inherit rpm
