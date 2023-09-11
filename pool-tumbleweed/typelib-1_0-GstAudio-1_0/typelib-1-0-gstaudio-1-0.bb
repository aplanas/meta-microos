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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "dd8ef702b70434065f33c74cc3347fd9f735702f9d720db883c12cf2dbf0d5c47d7c8532d2b7ddf38923b264bb66b61d4ca5fb08896483454748ced27e60c411"

RPROVIDES:${PN} += "typelib-1-0-GstAudio-1-0 \
typelib-GstAudio"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
