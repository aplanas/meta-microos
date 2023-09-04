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

RPM_NAME = "perl-Test-MockObject-1.20200122-1.15.noarch.rpm"
RPM_HASH = "c8d06bbe02afce2a90efddd7e26cf532c16e8c865c7b1a67420bee4e2eb3d90a3648276f1c17f34610e5333d3772d0f11f7d4d61c72802fbfeb7f7bb217b9181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockObject \
perl-Test--MockObject--Extends \
perl-Test-MockObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-UNIVERSAL--can \
perl-UNIVERSAL--isa"

inherit rpm
