SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstphotography-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "75f3908b5d94c1c39f91416d01b329f882ac616bcc475ba3cfa137fc5f6c284a034bda145f85c9748e170d036a9ac21bf8389751536134d1260a727a82c6d661"

RPROVIDES:${PN} += "libgstphotography-1-0-0 \
libgstphotography-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
