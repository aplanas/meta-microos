SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python39-libmount-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "b97c5e042549558827c9fa7c464c14a8524edd8c66c49b57916250040d86958a4c24c40d96184a03778fd717c4e47bce875e4e17098f1201e76f5588eac54ddf"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
