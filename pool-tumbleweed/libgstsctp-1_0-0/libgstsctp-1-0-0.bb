SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstsctp-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "147e36c9c117851a6639b315ad837639303a2a2480d3a4082b13b56cf6ade6fef98ad351c5e880bcbd8ca4b93a115eef2fdd74594a0a8808fe1ae3876527bcd4"

RPROVIDES:${PN} += "libgstsctp-1-0-0 \
libgstsctp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
