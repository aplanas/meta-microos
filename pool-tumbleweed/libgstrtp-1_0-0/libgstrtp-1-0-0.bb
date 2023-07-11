SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstrtp-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "68ada051142424bdd81404e362e009195c07201a71b02ccacc27e3d1398dc2bf445eba6c40261d285f66b16012070f16ef51c48551cf0437e23be7c776dc6148"

RPROVIDES:${PN} += "libgstrtp-1-0-0 \
libgstrtp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
