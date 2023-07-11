SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstplayer-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "3fd04a82f2a25b18db726ff19dbf241ee7e87711257bd19fcae4a927cff7d88443a194517cc95f7b59b1069418899f6a5878d563991c8e47bc9392e64b0e79dc"

RPROVIDES:${PN} += "libgstplayer-1-0-0 \
libgstplayer-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
