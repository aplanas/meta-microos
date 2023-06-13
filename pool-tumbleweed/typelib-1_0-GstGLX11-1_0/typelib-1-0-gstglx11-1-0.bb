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

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e6aaa5c46c982c7e8f35c4576f12b678e110876d39c565124529f4b08a9717054f03f92c98c7370e8c8fe50ab8845e3c7c71eb4706ff7e0d80e043bc8e1f0998"

RPROVIDES:${PN} += "typelib(GstGLX11) \
typelib-1_0-GstGLX11-1_0 \
typelib-1_0-GstGLX11-1_0(aarch-64)"

RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstGL) \
typelib(GstVideo)"

inherit rpm
