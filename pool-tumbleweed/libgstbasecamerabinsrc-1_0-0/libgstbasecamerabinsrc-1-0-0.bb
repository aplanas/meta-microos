SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "8fa9d8062da2e2d4cba0d36f7be15064e62c0303562e49b9fd615eb275e61c3adf3c0063ad675cc72befd4c131ba2444089b85752ad904afcb84f0b22a347cb9"

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
