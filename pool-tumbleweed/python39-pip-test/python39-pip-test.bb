SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-test-23.1.2-2.3.noarch.rpm"
RPM_HASH = "26954180ce340afd03f04d73090e0508c73e1b5fd42c68950563589273452539ee9fd117e380704370d147cdb445095348cc0b9c004dbee13454680399484c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python39-setuptools \
python39-xml"

inherit rpm
