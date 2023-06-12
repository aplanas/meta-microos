SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstallocators-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "6925bf4e6e72cbdd6af38287dcb7958b73d32055a4fcf27cee7d853d9ee3ed4527f1aaf2cb94f56f970fcfa6c46c930546ab97188139d31831bf630db449d778"

RPROVIDES:${PN} += "libgstallocators-1.0.so.0()(64bit) \
libgstallocators-1_0-0 \
libgstallocators-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
