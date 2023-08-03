SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstcodecparsers-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "150863345e572ce6ab58524aed10595928ee6e1ee64689b0026b194eef48a7ea45fd5e840a1615485128e089de1d390b72cd26e4a5721207bd261b4ecca48de9"

RPROVIDES:${PN} += "libgstcodecparsers-1-0-0 \
libgstcodecparsers-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6"

inherit rpm
