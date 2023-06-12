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

RPM_NAME = "perl-Test-MockObject-1.20200122-1.13.noarch.rpm"
RPM_HASH = "26adc0be37d40bed96706717eba623a0079644f7ac658f655484c21db9e9b2142261431c0088c2a833fa4fb7a1b4f5e5a5d6f7d8f662d9b47604df44f9021d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::MockObject) \
perl(Test::MockObject::Extends) \
perl-Test-MockObject"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(UNIVERSAL::can) \
perl(UNIVERSAL::isa)"

inherit rpm
