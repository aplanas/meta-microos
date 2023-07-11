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

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "e43a61885a5405babff765641d3d49f94662e0c75e3f81b9d32008562b71e22682fa2555a5b751b46465f44e266cd2269d5f4dfbce0b68d1d7afd2c224392239"

RPROVIDES:${PN} += "typelib-1-0-GstRtsp-1-0 \
typelib-GstRtsp"

RDEPENDS:${PN} += "libgstrtsp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstSdp"

inherit rpm
