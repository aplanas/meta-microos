SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "d87e6512228d954398a2a771bbccc8f1c6d1a2d2830dd04591330c5af7428ccfc010653e612458bd78fda457763834cac8d0443af7054c59a1bb55f8373f9757"

RPROVIDES:${PN} += "typelib-1-0-GstWebRTC-1-0 \
typelib-GstWebRTC"

RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstSdp"

inherit rpm
