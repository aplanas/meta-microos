SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstbadaudio-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "f9c4d3654754e159866f505f859b7cc03b21fa611f6399f20e16ad3087f0d512e150f5d2d323cedbeac934b9abfb3a246e7e28d0c74d1309bc1b804cf0930592"

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
