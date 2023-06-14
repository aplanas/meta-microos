SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstisoff-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "6cbba963c559e4c103e782e94133f50f7ed479f1d2501e4d3482c452443470ad6777fcbabee2f3eca0c304f27c9ead761414eb0602422847b23f5d81cccbf12a"

RPROVIDES:${PN} += "libgstisoff-1-0-0 \
libgstisoff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
