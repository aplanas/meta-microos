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

RPM_NAME = "typelib-1_0-GstGL-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "94428ee4338bab9108d8dc0c4b3249882c177ca070dbb5dd60e6c2c2f104e2ee8a310103a7cfd7a93199800940c876a75b0c58c4e00ea94ef19b3670b88ffa88"

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
