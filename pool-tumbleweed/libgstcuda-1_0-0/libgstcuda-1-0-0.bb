SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstcuda-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "9b46eef623ce5ce8d6ac29c9e71681174cfb419a85c9bb9ae0091b69cfb08270fb9b78fdec5e0c8c2a919b670c3c190f38690b0fc3cf4125fd1832da71113a72"

RPROVIDES:${PN} += "libgstcuda-1-0-0 \
libgstcuda-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
