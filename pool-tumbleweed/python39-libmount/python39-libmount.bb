SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python39-libmount-2.39-2.1.aarch64.rpm"
RPM_HASH = "023e89f0c9b4abf15769807a0bae9eb69a01eb9897115b8b373631092fb2616f02d6da4efaaad3a4b2379c04d2b3fed7ca7d8760628f181a2c799463a1fcc0cd"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
