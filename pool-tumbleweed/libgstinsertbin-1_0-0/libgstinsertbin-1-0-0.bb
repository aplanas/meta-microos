SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstinsertbin-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "321415e6a86b1b65983aac3334d3f60c47b95d62d36d386b9e055cf2c5f08e0c187258df9a20799914d0dd3173b88bb697f3406feed072df1b478b61bc35373f"

RPROVIDES:${PN} += "libgstinsertbin-1-0-0 \
libgstinsertbin-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
