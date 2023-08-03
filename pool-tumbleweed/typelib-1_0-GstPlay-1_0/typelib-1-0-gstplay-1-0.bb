SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "2c2cf5ad4905af637baf465fd266bcf4fcc6c1d21a2d3be515c1b4c28a7c03b7d2e8b610d988fd49d26dd64c2506a8e7f6e7a22f7983e4f92688c7865c76d6b8"

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
