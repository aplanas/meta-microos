SUMMARY = "An IPC library for high performance servers"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8+20230721.002171b"

RPM_NAME = "libqb100-2.0.8+20230721.002171b-1.1.aarch64.rpm"
RPM_HASH = "5ca89256cf55b5938b16f2fa16a733ab14c08b53fcbb5b5d8a9ee50011646c42d835ede803f222b81e2c04fd109f0a0bb85a8a80cdf0bc73af370c7078fd6f93"

RPROVIDES:${PN} += "libqb.so.100 \
libqb100"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
