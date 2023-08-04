SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstisoff-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "be2ecc955e139806c03e7921b909f2619593b6efef66c51356f815ac894303d837c4b1771f0b28809d7cbdf68f83d81e753bf2180d6ebc29fd13d6b516feefe2"

RPROVIDES:${PN} += "libgstisoff-1-0-0 \
libgstisoff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
