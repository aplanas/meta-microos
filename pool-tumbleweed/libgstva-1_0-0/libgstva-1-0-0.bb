SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstva-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "0d7833ed10a92f843210ef56ffad61cd9abf46f5ae3f2b561592f145038196228afc1b7d2ccfc8050e3d4bf232e00f698027362cf08fe2ebea6fd43d2c9169c9"

RPROVIDES:${PN} += "libgstva-1.0.so.0()(64bit) \
libgstva-1_0-0 \
libgstva-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libva-drm.so.2()(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit)"

inherit rpm
