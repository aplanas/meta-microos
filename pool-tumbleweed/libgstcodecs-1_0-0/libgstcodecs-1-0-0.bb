SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstcodecs-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "018854c5b7ecd281cb3510e6648b1ac54bcae46c2993189e1da74d6460806d9a5499a878cd8081fe8f81fd6353fc56bf59227738acb93aeef65ce5bcecce65b4"

RPROVIDES:${PN} += "libgstcodecs-1-0-0 \
libgstcodecs-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstcodecparsers-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
