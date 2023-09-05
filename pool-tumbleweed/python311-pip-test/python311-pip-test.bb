SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python311-pip-test-23.2.1-1.1.noarch.rpm"
RPM_HASH = "64b6519c8d21ef074ee0237c2d713c27c10663384918bfee30f9c009fe6910760da273de8791508dc33a91124fd3d1c629c07fe4ea1d4ef9726fc491737a376c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-test \
python311-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
