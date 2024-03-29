SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstvideo-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "dab5ea31ceaec89f57d8265502762b758e7f962ab9dc5eb88bf2a848a1acae99c69cf680d3e96e162eade729f5afd5aab08b11957dc4c2b7cd8e488034bf3632"

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
