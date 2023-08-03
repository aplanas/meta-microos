SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsturidownloader-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "dc722846736c24a2d06e8ac76970faf6b7ec4afe5b05ee5517f7c0faa83da85abb32139f8866249fcf88840ee3fc71ee5a5acee34b78db123beed3b8f0215f34"

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
