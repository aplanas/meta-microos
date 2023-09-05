SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python311-pip-wheel-23.2.1-1.1.noarch.rpm"
RPM_HASH = "19009018a338703704cbc2a6f7f58abea83748f2998d8c007b8099e06fcb8d5785bb38f263f1dc42ba410f4cf1a9d3e634a16ebedf8b1a4767012d4c523952c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-wheel \
python311-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
