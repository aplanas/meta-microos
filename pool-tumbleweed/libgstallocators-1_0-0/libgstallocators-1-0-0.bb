SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstallocators-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "5987f9bff3e8b25a2eaee251613ea9103c69259583053c9ff681cb6ffcacd5628d8176b80a32ef95d79e744b5ddc598f0d74796c4ca89878a83924f9a8c445f4"

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
