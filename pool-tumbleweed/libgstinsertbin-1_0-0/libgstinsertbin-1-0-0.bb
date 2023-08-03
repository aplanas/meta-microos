SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstinsertbin-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "ff9ce103c24dfcffecb3cb5aff3478774243540a1ddb350cf8cd983e19534db6317648aab573bd300986b03c9564006734be1f54ba39a90e65654b86e3b6c7ea"

RPROVIDES:${PN} += "libgstinsertbin-1-0-0 \
libgstinsertbin-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
