SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstapp-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "c0c8ff5ffcbca1d5fdb6051808b68ed01e1e99a798f5b95edad982f7e36148ce9eba9d324ea27cdce4248fad8b45516fd909c5b09d1124e4cc519c60463bb170"

RPROVIDES:${PN} += "libgstapp-1-0-0 \
libgstapp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
