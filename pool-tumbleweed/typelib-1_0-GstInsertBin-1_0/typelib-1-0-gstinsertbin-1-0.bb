SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "b5289ac24036cca0eaed687920ea0abaf35baf116354dba273953281d09ea36f83a46a8c45821ac608236514b6716c0d1e68d6554781537a97904e179771dd91"

RPROVIDES:${PN} += "typelib-1-0-GstInsertBin-1-0 \
typelib-GstInsertBin"

RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
