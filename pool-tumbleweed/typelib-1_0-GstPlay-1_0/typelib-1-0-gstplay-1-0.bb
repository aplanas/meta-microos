SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "54688ffd25b0b00de2387129a335bb54c5b4a3be90adcc6cbc9b8e26b8f5c155ae3606e074ed2b1567db01ec842a16992541a6b7cc9a7cb0ae364a30b43c6b42"

RPROVIDES:${PN} += "typelib-1-0-GstPlay-1-0 \
typelib-GstPlay"

RDEPENDS:${PN} += "libgstplay-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo"

inherit rpm
