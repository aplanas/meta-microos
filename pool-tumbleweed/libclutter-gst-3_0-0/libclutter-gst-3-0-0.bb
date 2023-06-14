SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "libclutter-gst-3_0-0-3.0.27-2.4.aarch64.rpm"
RPM_HASH = "6946219d6a5b7d1fdc4b6ce41fe5e4f691a352c0ccea1d75b25a2fa62df49cf1f64a65adf979517df43f72a50815fc4bcb0efb08feca8ffbcbba437491735b1c"

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
