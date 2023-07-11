SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstriff-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "a9d46dbe569fc9d6d408c3a5c4546a5e89d69f2d1657d4b914051d51f3d9ca36922d7fa9be1dfc1e446180bd688c33ba562ddb9fb6ac2b024f338b99c701e1eb"

RPROVIDES:${PN} += "libgstriff-1-0-0 \
libgstriff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0"

inherit rpm
