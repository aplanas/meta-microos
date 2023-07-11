SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-easydev-0.12.1-2.4.noarch.rpm"
RPM_HASH = "3bda4896b2c08d5a0318d89ab61e5e913f133c23e98edbb61179aa21953b06995b8a83d2b7dea8704267a610b01acbdef4acfd58ab0bbb3ebb67c1f73f9009dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easydev \
python310-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-colorama \
python310-colorlog \
python310-pexpect \
python310-setuptools \
update-alternatives"

inherit rpm
