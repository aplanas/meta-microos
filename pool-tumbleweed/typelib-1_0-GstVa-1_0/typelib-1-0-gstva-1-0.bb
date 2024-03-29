SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "71a8468126a259ad7dabe9ca562eef4615d57f108e32b2c21e2fc6f1542d0f76681d7364f0faffec6328adf859b1188d001cdab01696a22c46b69666cb56dea8"

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
