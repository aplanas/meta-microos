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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "024f1260096747e8404402766c5802d3cd10abf80d2df844243d5ae0c01727cf98fafc9df5a8c18d9a77a80b90c366e6eabded4bc4ae340ee3f2b96180c28cb9"

RPROVIDES:${PN} += "typelib-1-0-GstAudio-1-0 \
typelib-GstAudio"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
