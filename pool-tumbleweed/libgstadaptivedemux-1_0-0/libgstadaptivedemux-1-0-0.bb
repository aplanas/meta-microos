SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstadaptivedemux-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "e44f074d2934b81223e853ac2c36e8eeedc27fa6475a32b2608cc551b1c2c994b166897f910680a007bb97ae50bd9f94b7bcf4bcffd03579c44520f93ab81617"

RPROVIDES:${PN} += "libgstadaptivedemux-1-0-0 \
libgstadaptivedemux-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsturidownloader-1.0.so.0"

inherit rpm
