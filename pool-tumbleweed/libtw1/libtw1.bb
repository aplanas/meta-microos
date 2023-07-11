SUMMARY = "Main library for twin"
DESCRIPTION = "Main library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtw1-0.9.0+17-3.6.aarch64.rpm"
RPM_HASH = "fe0315bb8a115a1c37b72fdd250a21bdb6a49f0f186ad36dbf1625ec0a92b664c70deee409fa7e9e935fca1d077f007be9f191f5c592cdd38e941b8722ae8a04"

RPROVIDES:${PN} += "libTw5 \
libtw.so.1 \
libtw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
