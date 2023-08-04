SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "203d0233c7aca55f5ce38711c8f5fa1fdccb4ab81f6aea12b677bd3d9855c6e2313df11a374d73eb1eb780627c0c78a003273d5df5482f56a59e172e67be03c1"

RPROVIDES:${PN} += "typelib-1-0-GstWebRTC-1-0 \
typelib-GstWebRTC"

RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstSdp"

inherit rpm
