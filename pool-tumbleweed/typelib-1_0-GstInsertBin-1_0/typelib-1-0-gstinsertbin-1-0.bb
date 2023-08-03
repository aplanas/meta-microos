SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "eba8c91edcdcbd52be5aa67b8bd03ee7a8d6c4a3e17586d99e9832d058e4672030ea38ff4dff95dfca7373eb2b06703801b21f47217d3b7a84470cd9544b883c"

RPROVIDES:${PN} += "typelib-1-0-GstInsertBin-1-0 \
typelib-GstInsertBin"

RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
