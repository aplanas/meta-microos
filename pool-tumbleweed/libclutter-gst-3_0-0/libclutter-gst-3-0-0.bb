SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "libclutter-gst-3_0-0-3.0.27-2.5.aarch64.rpm"
RPM_HASH = "8099354a972958a85c6bc993ab4feb888032a5ecb9eca3bf3d6b4c382a75576dd49a9e4df7040461a3a6fcda4045ebad1302c13970c062d2d01da36ad2d5431b"

RPROVIDES:${PN} += "libclutter-gst-3-0-0 \
libclutter-gst-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgudev-1.0.so.0 \
libm.so.6"

inherit rpm
