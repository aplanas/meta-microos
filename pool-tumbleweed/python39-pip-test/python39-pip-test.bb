SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python39-pip-test-23.2.1-1.1.noarch.rpm"
RPM_HASH = "8d688ba816a09fb43b6b87f0b54a45f51aee926ea535a87f4082284d067dd951c3744b74f7a267027a5aa8236249cb8f91af092d1820e12e82c8b82b6b1b3e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python39-setuptools \
python39-xml"

inherit rpm
