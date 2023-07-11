SUMMARY = "An OBS source service: running all the osc source-validator checks"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service runs all checks as required by openSUSE:Factory project. This can be used \
to guarantee that all checks succeed also on the service side. This plugin can be \
used via project wide defined services."
LICENSE = "GPL-2.0-or-later"

PV = "0.31"

RPM_NAME = "obs-service-source_validator-0.31-1.1.noarch.rpm"
RPM_HASH = "72b351017e693361d5d22f05064ce2b2011e55d1fcabd7149f18b7786ba5c681194a58f4716713f99d879663de83f2b18ffb54c39e8c8cabd338acf863b4efb3"
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
