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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "ee00e6cc6dadfd334d835bfd94792b00ffb973b72381d2bfe124fc26cd71ae85462dabd53a9d3cdaf39afcfcbe8343abed905361e405f9c309d2b0e9127f26af"

RPROVIDES:${PN} += "typelib-1-0-GstTag-1-0 \
typelib-GstTag"

RDEPENDS:${PN} += "libgsttag-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
