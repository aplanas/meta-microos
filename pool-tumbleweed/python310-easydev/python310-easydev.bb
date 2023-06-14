SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-easydev-0.12.1-2.2.noarch.rpm"
RPM_HASH = "f182107f7c37f83003fc2a82e878c4f9b2264eac2a5be4592e458d877e4a2e5d14464202c42840849d666b6dc4a02b689e30cc3d03ee55c93ee8284a2b253e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easydev \
python3.10dist-easydev \
python310-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-colorama \
python310-colorlog \
python310-pexpect \
python310-setuptools \
update-alternatives"

inherit rpm
