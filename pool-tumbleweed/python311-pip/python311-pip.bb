SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python311-pip-23.2.1-1.1.noarch.rpm"
RPM_HASH = "622b6dcb36b3ae8e65e647357066cbbe4f5a4adbd441cc2e0cb2825a2913714952d7e5839490245e1a61a207c5588eed9e21d261c0c22df81e77844a8ed93c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip \
python3.11dist-pip \
python311-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi \
python311-setuptools \
python311-xml"

inherit rpm
