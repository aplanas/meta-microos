SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "235c214774622b0a5e2053610dc20dd50c838205ea0ae12cb554637824a10b851985708bd99d4fda4828442d95f77b0f4c49725b12e14938de9164cd425e5f3d"

RPROVIDES:${PN} += "typelib-1-0-GstWebRTC-1-0 \
typelib-GstWebRTC"

RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstSdp"

inherit rpm
