SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-23.1.2-2.3.noarch.rpm"
RPM_HASH = "e5ce790e15813cf19aed8d1641d8ccef55ac403308604e96d1bd607e6d04304d6bc615b23a34d0542e8e68eda374ad44c940e0228e23455c7b30090b4ec94936"
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
