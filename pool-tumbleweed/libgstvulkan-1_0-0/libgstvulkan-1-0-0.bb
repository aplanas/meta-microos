SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstvulkan-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "44934b51b871a43a57474e7391d07f40383c62d805fb1a35c95e47108135284592fb4f07990a07b80de261000089fbcbc66eccf39e578abe25b3a0dd34bde341"

RPROVIDES:${PN} += "libgstvulkan-1-0-0 \
libgstvulkan-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
