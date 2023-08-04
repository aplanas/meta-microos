SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "23d6368bb3d7b49629536d78004e85339a0ee189fbd223fe1a97b38e298a9428b56efdda77cac4ea68bba1bf5e2323e4f7bc4b995cad58661357c447dad8bfd5"

RPROVIDES:${PN} += "typelib-1-0-GstCodecs-1-0 \
typelib-GstCodecs"

RDEPENDS:${PN} += "libgstcodecs-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
