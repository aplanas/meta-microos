SUMMARY = "Wayland client side decoration library"
DESCRIPTION = "A library that can help Wayland clients draw window decorations for them. \
It aims to provide multiple backends that implements the decoration drawing."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "69f94fc96f26b275782916839b6a68efc92f7077d4be0a8e9f88b1915ee8a194f18238d05082e6e6ff814676902e4372340ca67dadf0a1b2891a04e223c15f64"

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
