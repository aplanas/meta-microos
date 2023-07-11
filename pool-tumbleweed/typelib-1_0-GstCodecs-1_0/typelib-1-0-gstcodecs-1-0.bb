SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "02ae989d01056748f911df61edce02d9d8114570195cf31f7b765f72f7bd38337c5c8c6d14f3704a5dce13aa81c67c436515386bce628abc9bb123ede1fbbb53"

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
