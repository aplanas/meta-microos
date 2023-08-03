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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "3de59d8b566fe2e23421da3fd54972dca50403e08ca8e900a5e30230b2ac5b164f0053a3792b3f60ead28662ae7b6c0f69877d9571f78a3e3c42eeb37b858e1b"

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
