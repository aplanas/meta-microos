SUMMARY = "Content-aware resizing plug-in for GIMP"
DESCRIPTION = "This GIMP plug-in implements the content-aware resizing algorithm \
described in the paper 'Seam Carving for Content-Aware Image Resizing' \
by Shai Avidan and Ariel Shamir."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "gimp-plugin-lqr-0.7.2-6.14.aarch64.rpm"
RPM_HASH = "13b5b86127f5953e5446b2debf001a2382c4fc6c413e9c0445b918ca87c1697bd33910e4274b86bffba3d0b2eb9847b0fd670a60adf9cdcf5d5e6d984c69a1ac"

RPROVIDES:${PN} += "gimp-lqr-plugin \
gimp-plugin-lqr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblqr-1.so.0"

inherit rpm
