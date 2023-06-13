SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "libclutter-gst-3_0-0-3.0.27-2.4.aarch64.rpm"
RPM_HASH = "6946219d6a5b7d1fdc4b6ce41fe5e4f691a352c0ccea1d75b25a2fa62df49cf1f64a65adf979517df43f72a50815fc4bcb0efb08feca8ffbcbba437491735b1c"

RPROVIDES:${PN} += "libclutter-gst-3.0.so.0()(64bit) \
libclutter-gst-3_0-0 \
libclutter-gst-3_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libclutter-1.0.so.0()(64bit) \
libcogl.so.20()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
