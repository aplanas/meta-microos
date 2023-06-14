SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a4abeda10a10c799b7a9c9c2008f8f4b3e61aea53d6cad155665d7155f3b3b804b09533afbdbe0d4e433490579e2f230a3e41d04864b75faaee37a28b145c054"

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
