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

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "6caa12c4139c51845259108ed75497e6dec8d123120bc43f3f6394f1690c1f8ea3217605af52aa7ec1c1b78fa81faa130ba85e769b0092b7e1edefa00a8fd34c"

RPROVIDES:${PN} += "typelib-1-0-GstVideo-1-0 \
typelib-GstVideo"

RDEPENDS:${PN} += "libgstvideo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
