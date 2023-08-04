SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstpbutils-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "35ae2d6258a1eb1dabd2e670e7991af44af07070bde7173c4b0140009b79b9bbce1fe4e598024a26038993d5ac8b3fd0415f7a0ba94c2ec396e933b2accafebf"

RPROVIDES:${PN} += "libgstpbutils-1-0-0 \
libgstpbutils-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
