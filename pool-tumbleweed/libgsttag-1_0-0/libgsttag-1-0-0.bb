SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgsttag-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "5feceb25ac7a2b4060e897a7d3de60962117087f8a92a166066cd6e12071077d7b3cb83d3f5e9be5f22aaf87fbaf0cc35081b6c87c8bf2358f94f9b89ec7fd87"

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
