SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstwebrtc-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "bfe787640982865c036ff3614030e254a6f170f51f2284a5da9fa02978fb5337a1c54a867a668bd76edae1870d78b61120c6193ee5199eae1f624e23f95821f1"

RPROVIDES:${PN} += "libgstwebrtc-1-0-0 \
libgstwebrtc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
