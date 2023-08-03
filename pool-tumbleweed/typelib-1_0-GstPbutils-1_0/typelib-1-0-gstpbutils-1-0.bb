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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "82b329c3924a4c8282d420db1ac921a4b9b906a2980b875cb13754d4f73ed4117fb00083c90dfd1f508fbe5f764a5111bf40481f2d26d3c9f73ee4a069f6bb36"

RPROVIDES:${PN} += "typelib-1-0-GstPbutils-1-0 \
typelib-GstPbutils"

RDEPENDS:${PN} += "libgstpbutils-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
