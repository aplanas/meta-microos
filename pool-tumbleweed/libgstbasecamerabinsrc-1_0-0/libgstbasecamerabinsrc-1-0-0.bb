SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "a9cdf1c15ce4d9c9f9125aebb92241accfb04a395a8febf477b0e7a8c9c23decb863400fceba96b33435b93c4838da2a0b26c3bb32796a9484fc93b33b699e8d"

RPROVIDES:${PN} += "libgstbasecamerabinsrc-1-0-0 \
libgstbasecamerabinsrc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
