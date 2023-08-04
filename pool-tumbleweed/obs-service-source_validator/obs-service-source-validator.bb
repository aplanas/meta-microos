SUMMARY = "An OBS source service: running all the osc source-validator checks"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service runs all checks as required by openSUSE:Factory project. This can be used \
to guarantee that all checks succeed also on the service side. This plugin can be \
used via project wide defined services."
LICENSE = "GPL-2.0-or-later"

PV = "0.33"

RPM_NAME = "obs-service-source_validator-0.33-1.1.noarch.rpm"
RPM_HASH = "759688d53d64a3060eb1ba647d93eafb608e59ee5aaf29cd82ca09ddfb9fda24057ee840cf6b11e0393da14e9451534fe6f86f05db622762bcebc9ca35c737e1"
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
