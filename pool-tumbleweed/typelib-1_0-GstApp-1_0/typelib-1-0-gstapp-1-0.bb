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

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstApp-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "4cd39d61591ee9f39307627f0453994d3a9a638b5b616507bedb3bc52ad55209952764f5c6dc1d2620bd1972d6d8a0dd7bf3b773c9300d2ba32539d8ad8472de"

RPROVIDES:${PN} += "typelib-1-0-GstApp-1-0 \
typelib-GstApp"

RDEPENDS:${PN} += "libgstapp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
