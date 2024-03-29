SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsturidownloader-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "85745aa48ae2dbafc32da805a712fedd68e1569a1b731d5dbdf55f11fcfb13d10c99375b710138a3e8fb6128dadf25688497ec000428f2340b764a4ea2c00f5d"

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
