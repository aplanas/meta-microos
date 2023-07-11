SUMMARY = "Check for presence of dependencies"
DESCRIPTION = "This module adds a test that assures all dependencies have been installed \
properly. If requested, it can bail out all testing on error."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.010"

RPM_NAME = "perl-Test-CheckDeps-0.010-3.27.noarch.rpm"
RPM_HASH = "24b5e7cdfcc97033a35b55fe1a9c97c39f159bf94c73887c5e4d7f6416876ae90ba6282d10c6e7d74ca48fc1dacfdc9834c248716554de616c7fb1315f9e5c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckDeps \
perl-Test-CheckDeps"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta \
perl-CPAN--Meta--Check"

inherit rpm
