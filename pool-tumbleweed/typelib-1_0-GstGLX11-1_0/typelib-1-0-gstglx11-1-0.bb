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

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "ef25abeb4c14ece4af4526cffc1f8f166eefd07483f44ec7bfdf81b18a89eaac43200480c3b9de338796184e2d42276c96d949ea9bd519fa4c65661e4160a6a1"

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
