SUMMARY = "An OBS source service: running all the osc source-validator checks"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service runs all checks as required by openSUSE:Factory project. This can be used \
to guarantee that all checks succeed also on the service side. This plugin can be \
used via project wide defined services."
LICENSE = "GPL-2.0-or-later"

PV = "0.32"

RPM_NAME = "obs-service-source_validator-0.32-1.1.noarch.rpm"
RPM_HASH = "a5873c1bd72e1ea0cbee114c3115cb1a9a01ed23a7e802980cb74a3b3d1ea4d37f1609f70ab9e44582d6dc5f742b9a976dfcce5b5332318f111f5bea8905ba8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-source-validator \
osc-source-validator \
perl-DebianSourceChangesValidator"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/xmllint \
build \
gpg2 \
patch \
perl-TimeDate \
rpm-build"

inherit rpm
