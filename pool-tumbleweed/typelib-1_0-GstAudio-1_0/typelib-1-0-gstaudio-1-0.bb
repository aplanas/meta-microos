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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "b64e5c61259774d651641843ea5383b7f106bf0ccd0bebedd13aa20c88d53d7ebf0df2e1f453a61336c08a4c3a1c6de14310dc4172e03f2b5e25676d5b81a7ff"

RPROVIDES:${PN} += "typelib-1-0-GstAudio-1-0 \
typelib-GstAudio"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
