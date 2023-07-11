SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgsturidownloader-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "b019c48a4213f7e26715da96cddc0d4b2159d031b6f942acad49840e2a804dcabeb9f5c0c7112a9b0c327e5bc04fe05f99347eea0741f5dff7792b2cd5e8f60f"

RPROVIDES:${PN} += "libgsturidownloader-1-0-0 \
libgsturidownloader-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
