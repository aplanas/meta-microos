SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "7cf93551bd4617154a182c33941dbafb2ad3f0e10670a28d4eafeb14e4844b12dd6109eaf8042f67c5d43d3dcb20bbd2fe3b1cb13fe028d44f05a134a62f33be"

RPROVIDES:${PN} += "typelib(GstInsertBin) \
typelib-1_0-GstInsertBin-1_0 \
typelib-1_0-GstInsertBin-1_0(aarch-64)"

RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst)"

inherit rpm
