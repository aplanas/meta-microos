SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "95780e54421814abe941422da3ae8a94f60ab3fe9c57405f0fb1e7498aa35df553a89abf51b710bed037ed2148d4294bfafa82ffb45ff557836e11d8db18636d"

RPROVIDES:${PN} += "typelib-1-0-GstSdp-1-0 \
typelib-GstSdp"

RDEPENDS:${PN} += "libgstsdp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
