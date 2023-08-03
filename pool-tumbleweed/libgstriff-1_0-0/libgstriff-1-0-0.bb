SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstriff-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "294b9343a4e085bb6ef14ff91272120263d111ad482ae4e95a2f5128dbf4a28d458c8739e55e9924191c814f2f1ac38bd0b0e8c3361c7c1a5f54c80fbf7772d3"

RPROVIDES:${PN} += "libgstriff-1-0-0 \
libgstriff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0"

inherit rpm
