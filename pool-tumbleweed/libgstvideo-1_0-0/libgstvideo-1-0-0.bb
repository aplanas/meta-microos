SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstvideo-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "d041885bfe65630e58c9f29a7cca1103210ccb59e41ebb26e9fda298ceb2889f5fb6aa2f43bc102912fceb346831bbfa6a43d7e42ec9fc7babea152164008a3a"

RPROVIDES:${PN} += "libgstvideo-1-0-0 \
libgstvideo-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
