SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstgl-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9fd33fe99b13be4cf7de3b321eb9b3fabb494b7eeeb62d1182d49ebd434360f9b48ab9e99af51ac7815d0046411c6e8f4b43949697c25d94d5be8d283745c30f"

RPROVIDES:${PN} += "libgstgl-1.0.so.0()(64bit) \
libgstgl-1_0-0 \
libgstgl-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLX.so.0()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
