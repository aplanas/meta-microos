SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.4"

RPM_NAME = "libgstrtspserver-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "a9355f2f0b8191b8da9a4f8924c77beacc54d74f380cf7259e09e92d5ba51d957a8dcf2b6170c86648275b5c51ed1bf03b9f54c751d79a21cbc52ff7350acd2a"

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
