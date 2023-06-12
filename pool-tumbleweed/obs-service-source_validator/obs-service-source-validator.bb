SUMMARY = "An OBS source service: running all the osc source-validator checks"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service runs all checks as required by openSUSE:Factory project. This can be used \
to guarantee that all checks succeed also on the service side. This plugin can be \
used via project wide defined services."
LICENSE = "GPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "obs-service-source_validator-0.30-1.1.noarch.rpm"
RPM_HASH = "91a88c1d2adc0dbce735adf094d9f164b39bdce6d189b07fd7692884c1e66091894e49d7495b3fc9fe3cfedce2fbeb2430b0ee518418fcdf7445648a887a28a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-source_validator \
osc-source_validator \
perl(DebianSourceChangesValidator)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/xmllint \
build \
gpg2 \
patch \
perl-TimeDate \
rpm-build"

inherit rpm
