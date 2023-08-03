SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "c441dc688c71b0b0d9f77ea7595dfe009574c0ab4d721b00c01e162b89e449a365409ae833290b5b8cf7e76dd7a4db63fcf829d2f5ed2477d93401a4db6e258e"

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
