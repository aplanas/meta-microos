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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "326b507d9bf97167f434a1c0aca865105c7d31a2c3028a8d84125d06de1ed41b7aa77b55201494dbd33225b1a66680aa2dcc44b7b812a99c887b6564c7016543"

RPROVIDES:${PN} += "typelib-1-0-GstGLWayland-1-0 \
typelib-GstGLWayland"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
