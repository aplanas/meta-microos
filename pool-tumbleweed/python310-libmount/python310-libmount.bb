SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python310-libmount-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "739028c8dd510d8b029bd8be75e2eb6f4e639d412636aa4422552d02945747065aa673e76cd053f060ae25d18400c3e0cf345994264522a52ecef0562b1a3fff"

RPROVIDES:${PN} += "python3-libmount \
python310-libmount \
python310-libmount(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmount.so.1()(64bit) \
permissions \
python(abi)"

inherit rpm
