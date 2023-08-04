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

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "10271d4350ced524d0bc161580011f7c64220e4c3d52750cd5cf9b7d472db50c203f3be699dcdf2d0410ee96ebb826c73f97b46c0a81305c87d6a9b22ded7494"

RPROVIDES:${PN} += "typelib-1-0-GstVideo-1-0 \
typelib-GstVideo"

RDEPENDS:${PN} += "libgstvideo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
