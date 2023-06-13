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

RPM_NAME = "perl-Test-Class-0.52-1.10.noarch.rpm"
RPM_HASH = "bf62d68cf86695a946611552d72eb3fe0f16d27b227810a059716cc115d71631d989c077c172df7d4a6806e632d91ea7e9266c414a657b7c55d3b985a8de7705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Class) \
perl(Test::Class::Load) \
perl(Test::Class::MethodInfo) \
perl-Test-Class"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MRO::Compat) \
perl(Module::Runtime) \
perl(Test::Builder) \
perl(Test::Simple) \
perl(Try::Tiny)"

inherit rpm
