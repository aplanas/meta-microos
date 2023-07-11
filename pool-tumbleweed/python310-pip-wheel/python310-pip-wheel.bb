SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-wheel-23.1.2-2.3.noarch.rpm"
RPM_HASH = "4c4476a11433367dca91f64ca0f9125a180840e932848073891644fbcec0d71f8c37e69a407cebb13ff88a442ed12f35c10eb7a592f5c06b3389061906253ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm
