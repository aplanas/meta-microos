SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstsctp-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "e19a64b2f7a83ca1ce01e800242b2f5a5a751f68ba9d02182ff91a70bc3945547559898b26d83d5d8946fd4a0ea7ef47b08480318bac5757ed3b3f3a8e97782e"

RPROVIDES:${PN} += "libgstsctp-1-0-0 \
libgstsctp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
