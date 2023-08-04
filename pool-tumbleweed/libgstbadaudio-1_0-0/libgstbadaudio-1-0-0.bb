SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstbadaudio-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "f36705aad2201e9b2596a68632668d14fd2d4f245fbaf5a3ed209907031a1f2570506f9864e12f38b521ea4ee0854a2b82038c25e6e4141abcb520e3174ae108"

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
