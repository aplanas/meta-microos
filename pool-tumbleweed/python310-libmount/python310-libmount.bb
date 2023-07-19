SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python310-libmount-2.39-3.1.aarch64.rpm"
RPM_HASH = "50e0b3881ba7b64fc034cb9c99eaab7316706be52e35b85e57d87a263c869de2e06bdfcae38fd888b21e72986e14dfc0c60a1341e5a2b27696195d0143f9924b"

RPROVIDES:${PN} += "python310-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
