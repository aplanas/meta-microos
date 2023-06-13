SUMMARY = "Main library for twin"
DESCRIPTION = "Main library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtw1-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "a843710dbd47821be0ebdeb64d90d4d29c5f719bf5a6e9307e74f153d60dd5d32f025595dd33f356a95bc8a2a6030d466b3fae851bae5b90a70e0579024b164d"

RPROVIDES:${PN} += "libTw5 \
libtw.so.1()(64bit) \
libtw1 \
libtw1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
