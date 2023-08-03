SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwebrtcnice-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "4d83cd9786fc2329fa8fe1cf7ff63eb4d785f2f4030dfbfed03c0ce6896aa23c294368ce24dff2085d60b729cfab7461099f28c71b7b9ee24ce0904757a421ab"

RPROVIDES:${PN} += "libgstwebrtcnice-1-0-0 \
libgstwebrtcnice-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libnice.so.10"

inherit rpm
