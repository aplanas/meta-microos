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

RPM_NAME = "typelib-1_0-GstApp-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "494d4fde5701f734d7400b00d2ec71a95a1274e8b1d71283a9549f05776118d868280ed97c92bfb85ddc1ce5da1bdaa754a09b912d7c9cce78de38ce514cbf6e"

RPROVIDES:${PN} += "typelib-1-0-GstApp-1-0 \
typelib-GstApp"

RDEPENDS:${PN} += "libgstapp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
