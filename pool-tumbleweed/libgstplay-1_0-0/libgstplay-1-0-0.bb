SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstplay-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "15620c12570a9f2277932dfd58b33471c30e61475e7722b926a4b3fa6c5653f3159e679eed6bf43f2d893d737124079d9f34b32f2e2f2be0ffb0360467e546ff"

RPROVIDES:${PN} += "libgstplay-1-0-0 \
libgstplay-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
