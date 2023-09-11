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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "2a7131d7a09bfd09b57fe029af1bf00d404c6d1cfd11d9a3b7cd8692a1c29701fbe090d042586e72ba60e5a3a2fee049a3871fad8aa1faa252bab2c8ce439ef5"

RPROVIDES:${PN} += "typelib-1-0-GstGLEGL-1-0 \
typelib-GstGLEGL"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
