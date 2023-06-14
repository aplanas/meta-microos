SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgsttag-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "8ab2ed5c5b896a9f5c641e275bceb545f70e66484520ca15a6d8b864a7dfac66b7560696ca937185fd4c5b4440a56419f42767edfa50f28c9f67ceb3db740c9d"

RPROVIDES:${PN} += "libgsttag-1-0-0 \
libgsttag-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
