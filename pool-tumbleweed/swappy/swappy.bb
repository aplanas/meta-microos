SUMMARY = "Wayland compositor screenshot editor"
DESCRIPTION = "A Wayland native snapshot and editor tool"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "swappy-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "6ef8f9330a2d81acc74ad2951d8f871026a7ad6c755082852d42621ba36cdf3c76c3ba3b65694acc0dc3e79a1ed53270b8dc4b825ac5c4b9c0d2952c2527b62d"

RPROVIDES:${PN} += "swappy"

RDEPENDS:${PN} += "fontawesome-fonts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
