SUMMARY = "Check for presence of dependencies"
DESCRIPTION = "This module adds a test that assures all dependencies have been installed \
properly. If requested, it can bail out all testing on error."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.010"

RPM_NAME = "perl-Test-CheckDeps-0.010-3.26.noarch.rpm"
RPM_HASH = "5b37a9c2a688deac5bb0c5b2b38653291d0316188012f56cee888ee1c9da22f6c6f43e7314365c7bce0470f3d3f15bfab9b36c0bcf87cbe7f19e4203442af850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckDeps \
perl-Test-CheckDeps"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Check"

inherit rpm
