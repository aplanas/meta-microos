SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python311-libmount-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "32ba4feef7bdf5e8517acbfcf08f97d2206187fa41f35817d984772aa29df30be8781a03f138a5c586481de05829ca16cd749a25e3ed74840b411575eb244bcc"

RPROVIDES:${PN} += "python3-libmount \
python311-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
