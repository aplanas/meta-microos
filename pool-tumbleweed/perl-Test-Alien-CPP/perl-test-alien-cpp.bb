SUMMARY = "Testing tools for Alien modules for projects that use C++"
DESCRIPTION = "This module works exactly like Test::Alien except that it supports C++. All \
functions like 'alien_ok', etc that are exported by Test::Alien are \
exported by this module. The only difference is that 'xs_ok' injects C++ \
support before delegating to Test::Alien."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.03"

RPM_NAME = "perl-Test-Alien-CPP-1.03-1.4.noarch.rpm"
RPM_HASH = "ae3442e3e50ddf315bfdb66afe7804a00604bf3c28b48c4187de1ea4fea29023a826b16733a65bdfdd70e777c472ef9bbd6254a31f5a56cf1f74f536114b182b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Alien--CPP \
perl-Test--Alien--CanCompileCpp \
perl-Test-Alien-CPP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CppGuess \
perl-Test--Alien \
perl-Test--Alien--Build \
perl-Test2--Require"

inherit rpm
