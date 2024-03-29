SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "75d9bcd8a29ddd2a6b43121958f061071c63bb59ef8eb4f21ce015d87d1ceb7b15a3ac0bacfb5696be8293701d9e2689f1ab258e5ed1556dfd01f8f54a84c547"

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
