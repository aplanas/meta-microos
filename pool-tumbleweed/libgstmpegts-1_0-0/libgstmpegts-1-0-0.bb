SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstmpegts-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "8e0c6cb1898d824214dc44deb318d2b89ad0e1478f529994229f44aa62cbe5b15bfa2ea950a80ad2b8d21a353c1a1bc5342fc8defdeb0ac36ab432c0be5eea6b"

RPROVIDES:${PN} += "libgstmpegts-1-0-0 \
libgstmpegts-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
