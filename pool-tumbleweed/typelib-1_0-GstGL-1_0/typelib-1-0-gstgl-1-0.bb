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

RPM_NAME = "typelib-1_0-GstGL-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "bc4dc3dc36d5d40755c5e5833b272a578ef50c28485251947d7a94c9327d2181bb716c6258b87b2e49a22005dbea5fdf2ce2a01287d681bf2d7a9a69e60047e1"

RPROVIDES:${PN} += "typelib-1-0-GstGL-1-0 \
typelib-GstGL"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
