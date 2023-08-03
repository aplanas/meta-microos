SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstallocators-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "277dc4d2bb6dc0ce118941eb7a4a1a050f0546ca730b19fee1ed1de4144e42ef52dacc88405a2d740dde9932e40f160c1b16fbd543f230d5f336560a2ba9444d"

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
