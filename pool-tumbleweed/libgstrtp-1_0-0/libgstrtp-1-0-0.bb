SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstrtp-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "61835eab922bc2b32826057412b50b98510350cdad6068126c607059220aa30dae4c9e4cf5e64af22d58e6e28c2528058346892581c24b396aa21de900e1a1a7"

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
