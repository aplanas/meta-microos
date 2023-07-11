SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-test-23.1.2-2.3.noarch.rpm"
RPM_HASH = "8f9c24ee3a6ff47824150c73c40f413c6d60658a26514882b86fd49fc699f0a43f1249f32ec1a0287fff124b1f11eb7c88d9b3fb4896fc3c18b67a9780db4289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm
