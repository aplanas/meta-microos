SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python310-libmount-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "9886e9a6f6d243874b63179168c99ce609b96760fa8dae947e5d7e33a5b9e2ad6a7cb252ba63afb9f4a02fdfba17600105d8cc75fec969f6b40e53f6a8a7f3d0"

RPROVIDES:${PN} += "python310-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
