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

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "9f6c5164bf1abcd92cc752b49e44434aeeb21e27b7eaf5329c32fbb347c4bc3f7398d10c79f5219df72ff4fc59dbb67288d312993367a25455814977aa4c12c3"

RPROVIDES:${PN} += "typelib-1-0-GstVideo-1-0 \
typelib-GstVideo"

RDEPENDS:${PN} += "libgstvideo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
