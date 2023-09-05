SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python310-pip-23.2.1-1.1.noarch.rpm"
RPM_HASH = "c530fb8997651576f901973b6e825a23eca8d348f82c7656e2bb187559ab7d208c1647b4aa3a8a4e7b46bf3ebc86b982d8d9f34526f2eefe02f6bb0c6b659d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip \
python310-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi \
python310-setuptools \
python310-xml"

inherit rpm
