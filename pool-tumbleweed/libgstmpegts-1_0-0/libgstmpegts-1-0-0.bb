SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstmpegts-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "9c5ba5b3b8556a87b4d9128c2fbf06cb0a37d8788ff794cf8a2efe7fa72ce7ec5d4500db60857a400bb0ff1e37d18182316f5725d0dfab3e6dc9b9c88d5e0493"

RPROVIDES:${PN} += "libgstmpegts-1-0-0 \
libgstmpegts-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
