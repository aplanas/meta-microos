SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwebrtc-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "4c201db551e8b068a2710f41d22d7b101d61e6bda14e42487e5d487a8de7e3224f62b2c989881e385cc94aa7335fa962b3d3597754b8b46c1a7a4dae0279c053"

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
