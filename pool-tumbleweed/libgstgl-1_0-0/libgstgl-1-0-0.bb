SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstgl-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "adbe1a2afa25b994ce3fe24827cefdfbc9b5e75e1132991ac1d325ec8b78b05ac2069785172d050dacbb969370371c699fe2c47d9c5a6cbfe65a06ba03a3bbdf"

RPROVIDES:${PN} += "libgstgl-1-0-0 \
libgstgl-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLX.so.0 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgudev-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxcb.so.1"

inherit rpm
