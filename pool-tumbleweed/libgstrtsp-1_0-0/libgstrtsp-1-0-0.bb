SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstrtsp-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "4e3f6cd24bc34a0bc57ede501d81ddbf622950828e9c0433229cb1a1e66959b0714d151f80d1d5bf19cf8bcc9607ace04488f10c811863254bb8629222c42ce4"

RPROVIDES:${PN} += "libgstrtsp-1-0-0 \
libgstrtsp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6"

inherit rpm
