SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwebrtcnice-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "8ad8d984c7ab56fad20dd94c22bb5220b8c8836634b1ab8937818bc9e5d7c0f92178c6b6979a9dd8cb72731bbba8ca454d331f23753a671b906132cdb141ac0e"

RPROVIDES:${PN} += "libgstwebrtcnice-1-0-0 \
libgstwebrtcnice-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libnice.so.10"

inherit rpm
