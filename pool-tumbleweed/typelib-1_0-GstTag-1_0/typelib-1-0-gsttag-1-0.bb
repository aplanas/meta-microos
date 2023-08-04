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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "a7a04436c5e253da84328d25c0bb98c6febe1754938eb1afdfe3ec8073f1369dd94a3aac402db0c44b6155622c7743e906de847a894708ce418bc2a8ce7130af"

RPROVIDES:${PN} += "typelib-1-0-GstTag-1-0 \
typelib-GstTag"

RDEPENDS:${PN} += "libgsttag-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
