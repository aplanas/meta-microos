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

RPM_NAME = "typelib-1_0-GstApp-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "2eb0c700f405cf4b38c8511e614e6297efb92c342289778d1b9cf1030b316188b29a67fa374123b29c9071e82d5165e840e47686327ff388fcd4b499df376176"

RPROVIDES:${PN} += "typelib-1-0-GstApp-1-0 \
typelib-GstApp"

RDEPENDS:${PN} += "libgstapp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
