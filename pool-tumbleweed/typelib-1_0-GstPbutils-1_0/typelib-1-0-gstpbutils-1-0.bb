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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "2c242b246a06fa8b0c0e217e4b41013d57e30d02685a15925955557e90d4bde53e04fbb1856ce6d317dba93d581dc06c1d6e024c82ec5f8947d7c2cf92073d09"

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
