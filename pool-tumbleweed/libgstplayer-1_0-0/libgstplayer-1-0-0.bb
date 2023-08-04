SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstplayer-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "2085de85dbfd2c496b00e972ca1dbd61a891884d2d20f1aa3595d9d4db78a17228d4eabb45f082bb4b2d23873b30e4e617a4f7cac93cfb7851c23fe20057698c"

RPROVIDES:${PN} += "libgstplayer-1-0-0 \
libgstplayer-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
