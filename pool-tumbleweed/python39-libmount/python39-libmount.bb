SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python39-libmount-2.39-1.1.aarch64.rpm"
RPM_HASH = "f73d7eed89b1be55d05ae7637d977aec0e6d5f94c7ea62924fe8f5b7891416eb4e3d52412ca3e9eb1f580b5aa2cba1aa156f356250358b6c9ee1ba80bd3e642c"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
