SUMMARY = "Coturn utils"
DESCRIPTION = "This package contains the TURN client utils."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-utils-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "4806d376b81370c13ff716f2531c6fc05c18700564d89ecd65dd443aa5c3d81e657e341dcb09fefabea4ff26976afb2cd5c4840c8b4c0c63f960f7199a0188f4"

RPROVIDES:${PN} += "coturn-utils \
coturn-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libevent_extra-2.1.so.7()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
