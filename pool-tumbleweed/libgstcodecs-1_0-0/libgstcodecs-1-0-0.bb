SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstcodecs-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "90c7f9e28e017d798b31a7aafe10938007967ca0940965f7fd1456d99547104390eaa265780aa4b7695f6e73800b9eaf89bf1407d5269bdb03c8235f7ea7e3d3"

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
