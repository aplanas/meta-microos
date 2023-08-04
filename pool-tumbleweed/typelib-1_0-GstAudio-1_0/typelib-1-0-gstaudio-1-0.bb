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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "ba3ee970966f08429058ef8511854119f3b1b652748ae7531a802ada43a860b7b688e00c05aa4b9dff64095046dcc63b83d6ff1da6d36b73bfbb37352b512537"

RPROVIDES:${PN} += "typelib-1-0-GstAudio-1-0 \
typelib-GstAudio"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
