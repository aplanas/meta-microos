SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python39-pip-wheel-23.2.1-1.1.noarch.rpm"
RPM_HASH = "5985162b891246579bf3aaeef1d8a63a11648529012c5ea66a60cc3019c7f2e68b04b72c77b0ed8336e62eb88bf85d34195f43da31e3e754455cd623c5b730f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python39-setuptools \
python39-xml"

inherit rpm
