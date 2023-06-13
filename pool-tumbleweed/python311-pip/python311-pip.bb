SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-23.1.2-1.1.noarch.rpm"
RPM_HASH = "12f6948b0e203756b134324252c9b42e1fd9d5d2ce5e24d38734aee01b4a03962da7a31283cbfa6a28a5ecfca4115f2ca204524c4280754fae149cc9445f1cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip) \
python311-pip \
python3dist(pip)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
ca-certificates \
coreutils \
python(abi) \
python311-setuptools \
python311-xml"

inherit rpm
