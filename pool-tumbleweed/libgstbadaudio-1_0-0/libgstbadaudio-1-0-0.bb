SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstbadaudio-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "33c95e39684f9c449bd2b9ae318d2407c50b4a54e0e7abbdf5a3731afc208c707823c136024f77253c1e8196cf1cc201a438c28e7e8eeef836a1319ee65334a2"

RPROVIDES:${PN} += "libgstbadaudio-1-0-0 \
libgstbadaudio-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
