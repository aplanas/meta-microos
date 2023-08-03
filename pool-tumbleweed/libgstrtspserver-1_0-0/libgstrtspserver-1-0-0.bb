SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.5"

RPM_NAME = "libgstrtspserver-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "09015b7c49a043f6daabb606367045958bf1ca64a3f7e904feb2f2d6cee8d0202ccfc1986adaf2916c4487ab3b1a920ea0aa3af47a6d3affd8b1af20f2d8bbca"

RPROVIDES:${PN} += "libgstrtspserver-1-0-0 \
libgstrtspserver-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
