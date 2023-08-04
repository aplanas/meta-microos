SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwayland-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "44b1915b34454aa2914804d0861d1373f8c1eb10d173066d53587c1771a389375294397a685041fc507fd5f35f1786a30b45c9757d9be63cfcadd80548f57d61"

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
