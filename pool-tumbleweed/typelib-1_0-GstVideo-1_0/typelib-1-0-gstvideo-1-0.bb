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

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "2879247b232e8973d36a9b77f7402012c531ffcba261031645ec4789d90169268d9acf6719efc691515db1b80f38d66b6e473daa6c59d511ba847568b8a7c7b7"

RPROVIDES:${PN} += "typelib(GstVideo) \
typelib-1_0-GstVideo-1_0 \
typelib-1_0-GstVideo-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvideo-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase)"

inherit rpm
