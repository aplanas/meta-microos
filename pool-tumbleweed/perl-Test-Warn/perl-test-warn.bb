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

RPM_NAME = "perl-Test-Warn-0.37-1.3.noarch.rpm"
RPM_HASH = "55af4c3cab46619286323b98b85ebf97233542371e1f8aca2c59dd4b002ed10f0b5374723c505095859e1c3c758dcaa3e9cbe706e0e7373801b39a7342f353a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Warn \
perl-Test--Warn--Categorization \
perl-Test-Warn"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-Sub--Uplevel"

inherit rpm
