SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "b2c67b8c8737741550abb0a05f25c1c3e1ebd42ff0e9ba87ff7464bc1556787e471d610e07c3a9b7640888b2ae88e92407c471583076f2cc5cef74f77f36c0c7"

RPROVIDES:${PN} += "typelib-1-0-GstBadAudio-1-0 \
typelib-GstBadAudio"

RDEPENDS:${PN} += "libgstbadaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase"

inherit rpm
