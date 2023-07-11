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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "f7f1d6400c9345a9f5513aa91574ef55f9f24ede88d92e81c10bc478a80ded6dad53baf62d8db77add52593a275acf53335be8802ef98358a5875eaa6699084f"

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
