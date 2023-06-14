SUMMARY = "Coturn utils"
DESCRIPTION = "This package contains the TURN client utils."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-utils-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "4806d376b81370c13ff716f2531c6fc05c18700564d89ecd65dd443aa5c3d81e657e341dcb09fefabea4ff26976afb2cd5c4840c8b4c0c63f960f7199a0188f4"

RPROVIDES:${PN} += "coturn-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libssl.so.3"

inherit rpm
