SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-pycups-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "2eebbdb3b8f14a9ffd988369ec2c9feda7736f0f9c331be2512dbcf611ae294d1597247ec735dd757fd5cca7997173aa81833e42ce96805e64fdc753ad0fa9ae"

RPROVIDES:${PN} += "python3.10dist-pycups \
python310-cups \
python310-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
