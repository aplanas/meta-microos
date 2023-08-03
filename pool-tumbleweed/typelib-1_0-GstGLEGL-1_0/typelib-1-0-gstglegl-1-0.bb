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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "060041f558630ca06de9834c26aaff420094762f8b0519dc6091b6a0d2928f1605dbb654c2dce8f53f3c03294dfbd235594f6fbb6d65db9cb03d2f69650ebb8c"

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
