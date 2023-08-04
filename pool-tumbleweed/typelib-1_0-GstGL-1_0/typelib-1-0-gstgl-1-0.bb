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

RPM_NAME = "typelib-1_0-GstGL-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "c296951700a505fb6f5966a0dd20ca041336471a763fc315124e1e83ea6eaa07e064d570f57a4c5013543dc7b9cf73795d8594f74d5da7c7d97ace799760dec4"

RPROVIDES:${PN} += "typelib-1-0-GstGL-1-0 \
typelib-GstGL"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
