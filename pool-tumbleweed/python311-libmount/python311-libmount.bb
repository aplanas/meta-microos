SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python311-libmount-2.39-1.1.aarch64.rpm"
RPM_HASH = "3e8c3627d04d1aa715efbe7fe244544d306a09e425c1a22ea7b60ae9bf5914d669a7c351e66ec152c4fb16449b5dceee4246031f61c4f8032d74e1bd92523cca"

RPROVIDES:${PN} += "python3-libmount \
python311-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
