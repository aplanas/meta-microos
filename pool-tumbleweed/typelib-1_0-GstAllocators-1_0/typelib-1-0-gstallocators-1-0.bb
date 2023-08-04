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

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "3428da22c11ebb223b08b99983172904eecb0401b59b462b3c5c3c0774065050b73c723052a0e399e7898e8c68d6f65aa0893813857a4a756ca34826553fcd2e"

RPROVIDES:${PN} += "typelib-1-0-GstAllocators-1-0 \
typelib-GstAllocators"

RDEPENDS:${PN} += "libgstallocators-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
