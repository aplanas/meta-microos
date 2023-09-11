SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstfft-1_0-0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "05a4a3f0e6fd11b11c610c583185a3ccc259d42286ca1d4178d2bcbff47964abe3a16af15837a5ff44a3d5e0469df5302dad5c6668eca7dc1b05ff1c448117ac"

RPROVIDES:${PN} += "libgstfft-1-0-0 \
libgstfft-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
