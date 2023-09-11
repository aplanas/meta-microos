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

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "87f2a64d711db204d7c2efda203957fad16c178a68c447ff2ed5eed18a510887c6bdd15bf7b1b73b05d89c8d48c7d3bb757b86aec5a396b11e1ae9677d04fec0"

RPROVIDES:${PN} += "typelib-1-0-GstRtp-1-0 \
typelib-GstRtp"

RDEPENDS:${PN} += "libgstrtp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
