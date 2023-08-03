SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwebrtc-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "80278055128db8617f8ac28157fcee3b3747963a42120bd291113ca4e805d45461ebbb69912d0bd2ed936cd7d7ed42b63970cc80c6b476c85616d1b42a40c9f9"

RPROVIDES:${PN} += "libgstwebrtc-1-0-0 \
libgstwebrtc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
