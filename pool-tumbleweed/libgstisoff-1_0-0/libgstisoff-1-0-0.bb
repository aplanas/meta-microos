SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstisoff-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "50d57c8f6426e02ba6548aec866101572f0d22ecc3438d51b5a8b82cd01af906b9e404f509ea6cefc6404d4b66cacf7af89b656e4156c336208329f6c01e2b3d"

RPROVIDES:${PN} += "libgstisoff-1-0-0 \
libgstisoff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
