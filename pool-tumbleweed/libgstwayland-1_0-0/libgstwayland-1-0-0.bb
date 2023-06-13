SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstwayland-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "b1ebfe9015fa47d5b0e8d09e45e8fd108c644e0e1aa727f9fdd607f6fa3dd4555a3afb1a0f544b08c5f428092c0b2dd128c4fd3dadf754b14647bbcda532af27"

RPROVIDES:${PN} += "libgstwayland-1.0.so.0()(64bit) \
libgstwayland-1_0-0 \
libgstwayland-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
