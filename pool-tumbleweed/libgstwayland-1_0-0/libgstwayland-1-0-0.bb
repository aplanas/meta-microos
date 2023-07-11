SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstwayland-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "47ac266005cebb0b961876165bb7080b8c3918b4876318ef2f608c53d73aaf0e97d58ee8031bae10b5857195a1b3f32fe47fadc742f0996c3db2418c318ee74b"

RPROVIDES:${PN} += "libgstwayland-1-0-0 \
libgstwayland-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
