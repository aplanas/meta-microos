SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstinsertbin-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "a14abd1cc0980b0523401b6f63f67950bc99ddf49f4c7482a9b1e1ce6e5d8b080311b9600fa836cd9dc0d9238f84bbaa33fa0058dbfde4de02c35bb0c53afb7e"

RPROVIDES:${PN} += "libgstinsertbin-1-0-0 \
libgstinsertbin-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
