SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-easydev-0.12.1-2.2.noarch.rpm"
RPM_HASH = "4070ce171b31fc41353a9241bd7ba4eefb9f1ce1503dbc74a7166f31ead1327be645d258fcfe4fae8a4136cf343e5c6deae0bc0cc4b2309dbf90f4f6071ff2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(easydev) \
python39-easydev \
python3dist(easydev)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-colorama \
python39-colorlog \
python39-pexpect \
python39-setuptools \
update-alternatives"

inherit rpm
