SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstva-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "a195d248414ccc81abf9740bb0cad1f2a57b0e7d2a2a08291d95f462bc7aaa5e235885abe46311b04507b399b64e8a96307e24f023d9eb159221db9a008cdaf6"

RPROVIDES:${PN} += "libgstva-1-0-0 \
libgstva-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libva-drm.so.2 \
libva.so.2"

inherit rpm
