SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstsctp-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "691d3152532b7b65ef1b8b9a89733ca563483b8a0581da618fa8d3922f1935359aa9d96c23d2ec37af75e49fa4948969abe0470c334960ffb204294d873ba2de"

RPROVIDES:${PN} += "libgstsctp-1-0-0 \
libgstsctp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
