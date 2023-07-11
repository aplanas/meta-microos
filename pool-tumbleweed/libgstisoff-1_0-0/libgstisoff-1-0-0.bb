SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstisoff-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "c702f22fa3653b4a7ed46111fc91543c4a82cb65e8521c23629eb2d84e1bdd4c294f177bb166745d10872dd988d5cf35f62aea3195faddd85efcab1c906bbb95"

RPROVIDES:${PN} += "libgstisoff-1-0-0 \
libgstisoff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
