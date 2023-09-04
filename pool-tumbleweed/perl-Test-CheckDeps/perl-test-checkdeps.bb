SUMMARY = "Check for presence of dependencies"
DESCRIPTION = "This module adds a test that assures all dependencies have been installed \
properly. If requested, it can bail out all testing on error."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.010"

RPM_NAME = "perl-Test-CheckDeps-0.010-3.28.noarch.rpm"
RPM_HASH = "0324d41256d0e54eaf4fd1b870d4895c9ebaffad4132c17a38aa3cabcaebe2e796d0c9374e7ff47a38eda46ef5f9b6daebd1ff7ba1aa3ec32cfb4c82239db11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckDeps \
perl-Test-CheckDeps"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Check"

inherit rpm
