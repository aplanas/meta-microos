SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstallocators-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "bbf56024f03f7bc798cd9b20a2c63a26036cfc3bb8b7b68ce45005f8db38a43e24b4955d4897e20a2f211d2dcf428bbb9a20ffd7cff340c688d0a6d584367123"

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
