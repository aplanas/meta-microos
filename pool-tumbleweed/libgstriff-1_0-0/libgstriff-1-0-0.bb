SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstriff-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "9c6f3fa8b2e27adb22201080d7b4bcbb6361613853cbb9ecab0788edeb28ed04b4757f001d06c943964b161d7b492f47541af8a66afd1b1b8531c60ec8d235c3"

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
