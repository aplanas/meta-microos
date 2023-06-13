SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstriff-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a954980db0a692ba3d09b0717333d4a09fcba65c368af9b4039e91c6b674a5965c16e92afb480c7cd3794c92bedf9ad43d0e5b69503d9f5a93d98a55c2f4eab2"

RPROVIDES:${PN} += "libgstriff-1.0.so.0()(64bit) \
libgstriff-1_0-0 \
libgstriff-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit)"

inherit rpm
