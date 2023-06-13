SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-23.1.2-1.1.noarch.rpm"
RPM_HASH = "4f4741f814ce9625e865a1eed3c276e38cf1b59aaf110245ed4d5fdeb3156e253a72524572146d2216da135d5000a19f49991e63281f8d69c4c201dba65904e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip \
python3.10dist(pip) \
python310-pip \
python3dist(pip)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
ca-certificates \
coreutils \
python(abi) \
python310-setuptools \
python310-xml"

inherit rpm
