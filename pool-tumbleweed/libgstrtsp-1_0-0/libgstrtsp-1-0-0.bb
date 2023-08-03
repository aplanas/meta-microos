SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstrtsp-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "48ec08c11b1dbe92edac05ea3352d317f7a430ddaa7fe4d077c62988aa7a13d30c87b6ce78d202c9a5f1ffff37ffc20163e24c6e4d0d220210ed38fd863c07e3"

RPROVIDES:${PN} += "libgstrtsp-1-0-0 \
libgstrtsp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6"

inherit rpm
