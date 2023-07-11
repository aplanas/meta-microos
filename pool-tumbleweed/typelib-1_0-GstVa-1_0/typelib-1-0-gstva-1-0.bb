SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "2f7ae34daed58f79ed9b806af81e07bcc6c10abbb9b722d301c431f7bc3262ae01f821b17684f29e2aea26ba79eb1e7f3f199d792b670c9ced68e2236e674f51"

RPROVIDES:${PN} += "typelib-1-0-GstVa-1-0 \
typelib-GstVa"

RDEPENDS:${PN} += "libgstva-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
