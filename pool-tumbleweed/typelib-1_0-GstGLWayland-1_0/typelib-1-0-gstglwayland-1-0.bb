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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "1af52238f970f764aa0c736cfb44ac93b77d4f85b111e5b64ea2ca4b2a5cdc3c3e154d97cceac5a4eb6f29dcc4726fd6794c929b73cecb9ecbfc227eacb9ca5c"

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
