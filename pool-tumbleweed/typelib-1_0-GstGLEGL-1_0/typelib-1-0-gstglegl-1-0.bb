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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "c108e386da36055ea675f7379d560c22e32d2908318d314abfde73efd0fb96968c95902688b4372066eb73185bbe54a48452796dd8cf7d77dd6d12aa57dc1c99"

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
