SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstwayland-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "7e4990f3e1027468c9527d9748242a370cc02b1a717af0bdb1c9493f9c633df8e78e6656dcd039d4acabbd99a9bea7e6ab1e6c3910b8a5b535308418e6d5a3b7"

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
