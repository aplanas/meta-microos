SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python310-libmount-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "ed617cbf0156b04a7db50bd45aefdf990b9485eae331a76ef84a1954bdff816d111427ea182fb310eb6f35e803fa8ec3431bee1935f95fb51e1f068d52b1837d"

RPROVIDES:${PN} += "python310-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
