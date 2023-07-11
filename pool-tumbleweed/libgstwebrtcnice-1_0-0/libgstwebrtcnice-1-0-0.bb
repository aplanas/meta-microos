SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstwebrtcnice-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "672ba808ad865f32507dc2090b4f09dfcb98af053f723412b5bbad13122a3747a735d473268031977e8f891eacf4ac447341180e279dd512659026832ca533cd"

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
