SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-wheel-23.1.2-1.1.noarch.rpm"
RPM_HASH = "fa93d65d8962b449d76e029a71bd028a537eaeda80032fe677a8d404d2236675a9554e56842f4c31780008267d569cd949dda2a5c61e956ea6b3471bf505ef76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pip-wheel"

RDEPENDS:${PN} += "/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
