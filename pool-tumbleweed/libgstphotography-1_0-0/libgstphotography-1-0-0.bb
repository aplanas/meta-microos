SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstphotography-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "a3867a7842bd47115d7f581b3157f4848f4fe399d895316568f093b50eb80aaca95e7477fc7e34a3e4c9e43e71e542c732d955cefea3f3bca7ff666f37dfceb8"

RPROVIDES:${PN} += "libgstphotography-1-0-0 \
libgstphotography-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
