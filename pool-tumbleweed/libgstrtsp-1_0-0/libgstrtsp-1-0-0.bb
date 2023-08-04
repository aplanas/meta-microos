SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstrtsp-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "4328aca65076a2ab4e7fe8c553b9694755b1a2ec230c5da57aae2b1a2d2de66c41add2dfafd25fb38c3d51449e9347cb8432088372eeab7750b6fe2ef2290a6d"

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
