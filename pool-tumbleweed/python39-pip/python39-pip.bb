SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python39-pip-23.2.1-1.1.noarch.rpm"
RPM_HASH = "1f06888a9aeedaa947692cc3c6f6961b5b613e17035c135cba8c8a4dc9af6573ad757c913e0f97a922e083effcdef2b142c755173ac9662e7873bc0faba33572"
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
