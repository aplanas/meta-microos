SUMMARY = "Perl extension to test methods for warnings"
DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests. \
 \
This module provides a few convenience methods for testing warning \
based-code. \
 \
If you are not already familiar with the Test::More manpage now would be \
the time to go take a look."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Test-Warn-0.37-1.4.noarch.rpm"
RPM_HASH = "9d1f3d031b1284a45d8eb2efc7e57a6474bcb9e9776a7667d7edbb3673a4a392a05dce43a27621882397afd9f22e4aa7e50a35196b5f8ba1102e5da941664de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Warn \
perl-Test--Warn--Categorization \
perl-Test-Warn"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-Sub--Uplevel"

inherit rpm
