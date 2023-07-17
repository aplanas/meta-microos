SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python310-libmount-2.39-2.1.aarch64.rpm"
RPM_HASH = "1a750236f40717119b0fb37858cf67c4b920d4b9f6f05f57f1bd3b93cfb78389925b1d9977c2352474e17800570c10de4fda30ce792aa350b9106c1b4712b028"

RPROVIDES:${PN} += "python310-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
