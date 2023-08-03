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

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "4f19e3d10c03ba7619ed04321bd7e965a3159b1bf3c323b4409ae665e8a959e7b0ee1a0eb28ae31ca47d25c11de595344115af1fc153d3127499f25a73dfc3f6"

RPROVIDES:${PN} += "typelib-1-0-GstAllocators-1-0 \
typelib-GstAllocators"

RDEPENDS:${PN} += "libgstallocators-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
