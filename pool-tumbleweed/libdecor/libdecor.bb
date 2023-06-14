SUMMARY = "Wayland client side decoration library"
DESCRIPTION = "A library that can help Wayland clients draw window decorations for them. \
It aims to provide multiple backends that implements the decoration drawing."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "7e2911342c5cf80f7bc9e28e95da6eb8448d03ae81a16915b6db0bf7193137e50bd08fe3e312cb28630e14c2924be28657013f298dcfc1ea3ed927ea29dd6552"

RPROVIDES:${PN} += "libdecor \
libdecor-cairo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdecor-0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
