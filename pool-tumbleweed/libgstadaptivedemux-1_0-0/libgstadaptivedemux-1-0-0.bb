SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstadaptivedemux-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "db566e5fff27979dd08674937b9226f07890e960e1b7ad063d5cf125b8098898284a2a63da78bc846e81848e4e7fa3e9054e6deb18090809b9b13de73b688600"

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
