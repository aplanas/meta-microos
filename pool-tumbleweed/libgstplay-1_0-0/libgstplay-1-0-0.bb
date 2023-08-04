SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstplay-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "7280f2c3a5c4c0036b1b975c4c522687115dfaad2694216218b4935f94bfef64bcfbc32ddc00d218fc873bc0c63de12e358bbb3b47d3e065363602c59e07f01b"

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
