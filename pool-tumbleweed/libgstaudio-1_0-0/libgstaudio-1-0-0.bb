SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstaudio-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "8e7c8f61612d263a4fbaa7cf03bcbfe0e5770b077b9d2c3b2443b15eb592ea3cd4fc5093164196b00e0d02c598bde72490542e948bc3d0e33bf6471120a956f8"

RPROVIDES:${PN} += "libgstaudio-1-0-0 \
libgstaudio-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
