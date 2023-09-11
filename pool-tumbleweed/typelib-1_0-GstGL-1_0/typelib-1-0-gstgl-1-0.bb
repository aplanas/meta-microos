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

RPM_NAME = "typelib-1_0-GstGL-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "fc464be962827d073becf00711207f27da4cb3edcf399f9970190f2baa58fbfdfc118b313bd8fe3c4f6eed428e7ba1faf9a4ab11b9410b1e1b6642471a1d85ea"

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
