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

RPM_NAME = "perl-Test-Class-0.52-1.11.noarch.rpm"
RPM_HASH = "ef8e7a75d7e28544dec82404af2ca1445aef35a0a50f22d9143b7cba72197feacc9066666958b18f5327a59008405e2581de62b9baf33b3bb30f959e1912f925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class \
perl-Test--Class--Load \
perl-Test--Class--MethodInfo \
perl-Test-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Test--Builder \
perl-Test--Simple \
perl-Try--Tiny"

inherit rpm
