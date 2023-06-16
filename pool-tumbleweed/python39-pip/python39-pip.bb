SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-23.1.2-1.1.noarch.rpm"
RPM_HASH = "1650cbc846c83ad0a049de617c9828646d98b90bf7b980f8952d2ae5b15d413fe4729ea78bf583e2cff28722f25c452821f863efea8d00246ded62288b94a967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip \
python39-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi \
python39-setuptools \
python39-xml"

inherit rpm
