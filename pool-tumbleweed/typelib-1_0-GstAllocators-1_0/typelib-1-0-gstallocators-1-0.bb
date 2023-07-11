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

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "ebe9465d984ecfac451430810304d438bbf35e618a5c7fdeb979851a267af98c754c834d8d044eb5f5545477bfa82c1187f81c6f16f6a728da32bb97ede2cb92"

RPROVIDES:${PN} += "typelib-1-0-GstAllocators-1-0 \
typelib-GstAllocators"

RDEPENDS:${PN} += "libgstallocators-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
