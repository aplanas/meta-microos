SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python39-libmount-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "7a2e3a25681f5fdee7271da0f60f72a4363bd1500cde4d4e96d2561407bff3a05bb5704006b427e4d2ab85bc5bee11e77146f2ece598152cefb1d57f27853d2f"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
