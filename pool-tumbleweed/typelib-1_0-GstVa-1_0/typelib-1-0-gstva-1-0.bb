SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "8cfaab23df80d0651e1d94af0fab2705747eba3a1a5b2cf0419ec97d3551e6a31676d598286a818725ea22165007d405a8f0c9a8a162a0e04f9bb330a592d67f"

RPROVIDES:${PN} += "typelib-1-0-GstVa-1-0 \
typelib-GstVa"

RDEPENDS:${PN} += "libgstva-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
