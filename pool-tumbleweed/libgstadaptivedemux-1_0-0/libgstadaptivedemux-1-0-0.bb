SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstadaptivedemux-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "8a60ee836a14aa9c1185f680c236104a1435b3132f376bdab2c81c086f71adf694c8ed85bdc531f640d5bfddcd4417caaabc50f874ce41ca0d9ed01a45a60b6a"

RPROVIDES:${PN} += "libgstadaptivedemux-1-0-0 \
libgstadaptivedemux-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsturidownloader-1.0.so.0"

inherit rpm
