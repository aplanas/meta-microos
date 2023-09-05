SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python310-pip-wheel-23.2.1-1.1.noarch.rpm"
RPM_HASH = "61277053a6dcbdd0abd57f44d05a9ed177e632a989c5662fbe41f4c8235e5f93716b18f3524b70cd47dae1754557fa2ac40a5c6f6d28341c07474197b96af7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm
