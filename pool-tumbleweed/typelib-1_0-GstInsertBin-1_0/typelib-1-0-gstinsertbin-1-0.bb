SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "4dc85a57650417dcf9e2b7c5f0ae8d697dc8f934db09a7fe9b0632b1ecfea17f40570965f585fb05dc6d53b6fa72044bfc35f273404e1df28dd33d1411770be7"

RPROVIDES:${PN} += "typelib-1-0-GstInsertBin-1-0 \
typelib-GstInsertBin"

RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
