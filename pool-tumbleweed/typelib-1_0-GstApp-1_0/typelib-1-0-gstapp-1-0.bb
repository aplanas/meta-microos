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

RPM_NAME = "typelib-1_0-GstApp-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "71e15cff750673e593be44cb8d5af3e6b9ce064c3f44408f4f313ff3a57b61499a2bd052e7ab879c7a4e46a8f2761cdcdbc6b72cc996654a36e7ff12e2937f92"

RPROVIDES:${PN} += "typelib-1-0-GstApp-1-0 \
typelib-GstApp"

RDEPENDS:${PN} += "libgstapp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
