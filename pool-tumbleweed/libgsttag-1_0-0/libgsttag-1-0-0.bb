SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsttag-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "4a1c68cfdc5b8cfc9485e8222d48f244ed13edc928f48bd7c6002bfe20fbbf90be21a916d9adbb25f600b1868d3ee3f7ce777aad1ba75cf2dde61d7d582b69c3"

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
