SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstallocators-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "5f0cad27c0809b26b1a9a78ebaf69363b1c4da1490ac2f44274e2a1ff9bfbbe62d8fafb9e7106e6dcf67d152932b9eb790fdfb5f00cd736f1b2adaf0d1409d4d"

RPROVIDES:${PN} += "libgstallocators-1-0-0 \
libgstallocators-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
