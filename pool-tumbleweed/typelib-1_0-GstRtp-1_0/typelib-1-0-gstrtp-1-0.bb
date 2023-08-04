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

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "5cf07c51d341bb0a99b95aae27af996fadab1772050719e2391093cfc039422866b30f7d91c9971d1572e85f4f0964a6ff85188789b1c99ddef6157caa65c154"

RPROVIDES:${PN} += "typelib-1-0-GstRtp-1-0 \
typelib-GstRtp"

RDEPENDS:${PN} += "libgstrtp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
