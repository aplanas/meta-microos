SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsttag-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "4361ca7b145456bfaf3359783076c53558166adfe65531465c25991718c6cac2fbcb4f29c7c2df61e98632d397b22ced63beca962bb795755d40d442de8014b5"

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
