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

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "3d2dcfda5c736bf58329c9a5c57741ece67ab968f4221c092899bf1f7cae80eceb8df96a8ea9b7ab8980e7102483fa6abca0eddb8e2aa141811fb36fb7952d3f"

RPROVIDES:${PN} += "typelib(GstTag) \
typelib-1_0-GstTag-1_0 \
typelib-1_0-GstTag-1_0(aarch-64)"

RDEPENDS:${PN} += "libgsttag-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase)"

inherit rpm
