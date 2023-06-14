SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "dcc0f90e7a79c7ce4f832d54493b4b7d7a3f81961e8fd66c1fb642e472e1e7c57adc566a7081c7f3644c7a0a61f0f59c87fd1e3065025bfd26685d7ecc0858d1"

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
