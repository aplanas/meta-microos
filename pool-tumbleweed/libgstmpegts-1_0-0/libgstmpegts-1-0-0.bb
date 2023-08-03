SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstmpegts-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "9b341c93c9e6b2503ba54fe286b0edd7ae725af220c9b4bc685b4c62f0dcd1e9340247a4496430d320c789bb4bdb81b4e14619216cefa64ecc070d770d0d631c"

RPROVIDES:${PN} += "libgstmpegts-1-0-0 \
libgstmpegts-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
