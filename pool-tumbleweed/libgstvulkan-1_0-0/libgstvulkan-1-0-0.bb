SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstvulkan-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "594e162d95c2cbe024272800a43c9edd9e9be8c214fd9b7c24dae13081063fcc18637921b62a08171915f3f36ebf7b7cb70ba9c7465ddca58b47824bf71b47fe"

RPROVIDES:${PN} += "libgstvulkan-1.0.so.0()(64bit) \
libgstvulkan-1_0-0 \
libgstvulkan-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
