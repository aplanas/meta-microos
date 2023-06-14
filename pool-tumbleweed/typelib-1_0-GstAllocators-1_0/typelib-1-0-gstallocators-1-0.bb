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

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "df14133db3017bd4d91464bea779b6db5cd618d3ecd65e186e0ab5b60a0cea0559968e32cff939c0308d22de25a4b1cc004c5ce6193d4d490bb7d5913fdb98e5"

RPROVIDES:${PN} += "typelib-1-0-GstAllocators-1-0 \
typelib-GstAllocators"

RDEPENDS:${PN} += "libgstallocators-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
