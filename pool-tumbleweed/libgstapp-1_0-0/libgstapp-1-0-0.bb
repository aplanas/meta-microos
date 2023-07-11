SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstapp-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "7bccadcf00a93e867ff0b1ae547e36667ed907861bb8bb1cbc9fccc459974b35badbee8c3f736a92718ae1c900efc4648a6ccf79847a12fe242b0254707b0f38"

RPROVIDES:${PN} += "libgstapp-1-0-0 \
libgstapp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
