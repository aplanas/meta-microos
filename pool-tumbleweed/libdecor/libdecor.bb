SUMMARY = "Wayland client side decoration library"
DESCRIPTION = "A library that can help Wayland clients draw window decorations for them. \
It aims to provide multiple backends that implements the decoration drawing."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "7e2911342c5cf80f7bc9e28e95da6eb8448d03ae81a16915b6db0bf7193137e50bd08fe3e312cb28630e14c2924be28657013f298dcfc1ea3ed927ea29dd6552"

RPROVIDES:${PN} += "libdecor \
libdecor(aarch-64) \
libdecor-cairo.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdecor-0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit)"

inherit rpm
