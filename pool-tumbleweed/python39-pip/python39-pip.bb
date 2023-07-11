SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-23.1.2-2.3.noarch.rpm"
RPM_HASH = "968bf8e98934a3a9f06f3b24ee46c1c362c1a27e951c4056d3c7f7bfe4c8b1c909043f949adf361d0760f2810e87498c55ad1fb0c1d04de49d793cbf356c84ba"
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
