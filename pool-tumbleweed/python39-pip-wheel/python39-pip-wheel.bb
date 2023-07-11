SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-wheel-23.1.2-2.3.noarch.rpm"
RPM_HASH = "1c00bd9c2b6408649fccb3121bbe5da396a818a84cc9df6e6e1e81a6262b206cb892c0b919351b8d1d99702d2bf1535e57b2172cb76a6d5d1a7e0de272cfbe35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python39-setuptools \
python39-xml"

inherit rpm
