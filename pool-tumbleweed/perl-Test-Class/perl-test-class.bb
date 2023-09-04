SUMMARY = "Easily create test classes in an xUnit/JUnit style"
DESCRIPTION = "Test::Class provides a simple way of creating classes and objects to test \
your code in an xUnit style. \
 \
Built using Test::Builder, it was designed to work with other Test::Builder \
based modules (Test::More, Test::Differences, Test::Exception, etc.). \
 \
_Note:_ This module will make more sense, if you are already familiar with \
the 'standard' mechanisms for testing perl code. Those unfamiliar with \
Test::Harness, Test::Simple, Test::More and friends should go take a look \
at them now. Test::Tutorial is a good starting point."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-Test-Class-0.52-1.12.noarch.rpm"
RPM_HASH = "1c7e44210b0075ce3abaa5b5bb4d20151df5d28264d4adc13485c48c709aea8321ce54d8bd02bd4ee0b64a2dce0e5f44ba0a7587fbaa9cae2d6b55347331cab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class \
perl-Test--Class--Load \
perl-Test--Class--MethodInfo \
perl-Test-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Test--Builder \
perl-Test--Simple \
perl-Try--Tiny"

inherit rpm
