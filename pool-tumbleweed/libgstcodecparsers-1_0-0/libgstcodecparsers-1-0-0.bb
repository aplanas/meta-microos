SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstcodecparsers-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "58ab2fcad10023112968e31409403c915263be5a1c90896a9b7015a39319ba36507f87fa575c92c05f297dc2aa436d5a5443f5f3625665191fc052768d83ed5e"

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
