SUMMARY = "Testing tools for Alien modules for projects that use C++"
DESCRIPTION = "This module works exactly like Test::Alien except that it supports C++. All \
functions like 'alien_ok', etc that are exported by Test::Alien are \
exported by this module. The only difference is that 'xs_ok' injects C++ \
support before delegating to Test::Alien."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.03"

RPM_NAME = "perl-Test-Alien-CPP-1.03-1.5.noarch.rpm"
RPM_HASH = "9907d6b597798b385ad8282b11512961faf43553dab74a93ba7b189e8e1b92c8ef6b579b9cf7193b80fa66dceab6ec17f0569da4c0dc16fb9103f7bebdef6f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Alien--CPP \
perl-Test--Alien--CanCompileCpp \
perl-Test-Alien-CPP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CppGuess \
perl-Test--Alien \
perl-Test--Alien--Build \
perl-Test2--Require"

inherit rpm
