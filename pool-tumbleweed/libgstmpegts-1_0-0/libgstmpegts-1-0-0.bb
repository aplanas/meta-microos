SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstmpegts-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "1efde649090ea5c69c1e0efbf01e23c1b709dc39f2d0af5afc86eb1b9db48717396395e77513cab5241aa63759c00bbaf4d7af25156a8ed2a24875944802a598"

RPROVIDES:${PN} += "libgstmpegts-1-0-0 \
libgstmpegts-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
