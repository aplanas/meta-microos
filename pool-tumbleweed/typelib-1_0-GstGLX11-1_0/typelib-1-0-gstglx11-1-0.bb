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

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "f66f20bb0af42c296d30d390637dfd0a17a343f6a876fd7fd77fc8bb8a76f0ee28663e97ec53f1010ea9bcc7011201c31ba6a5b5fed6068828327934dd85869d"

RPROVIDES:${PN} += "typelib-1-0-GstGLX11-1-0 \
typelib-GstGLX11"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
