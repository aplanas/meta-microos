SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-test-23.1.2-1.1.noarch.rpm"
RPM_HASH = "64303a53eb448ae258fe4b022a53ea6520d4972972b24302d172ed0149144620e6bd833d5908dceb60702445024ccbcb7043d66c33fce2ba918d0953a4d3fb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-test \
python310-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm
