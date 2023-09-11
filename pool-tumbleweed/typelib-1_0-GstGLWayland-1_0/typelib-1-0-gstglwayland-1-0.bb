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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "01a96f63404868e902b29fbe591917c5d5d08cfefd47f23538e8a0a44d402a8f01fb0167fbc3800e7b9e9c6b372e09635ea323e97d9abfd0688e89e17e522265"

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
