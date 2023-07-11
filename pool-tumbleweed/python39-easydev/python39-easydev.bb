SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-easydev-0.12.1-2.4.noarch.rpm"
RPM_HASH = "c13b2a6dee0ad0e039de17d3a23e7792c3e2e62984b455c31697cb871a9b74cb0b188099cba345b556ee0eb11fc3a94ea987659a131dafa25c765935ffc89041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easydev \
python39-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-colorama \
python39-colorlog \
python39-pexpect \
python39-setuptools \
update-alternatives"

inherit rpm
