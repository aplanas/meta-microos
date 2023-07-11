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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "9e72101e007fc9448679fae04be3f2539cc31c505ab842ac87869a588c441ce495b450784b850809e1c8f8925ff0ca85b4f38866c07acdd0e638f1785c5ee9de"

RPROVIDES:${PN} += "typelib-1-0-GstTag-1-0 \
typelib-GstTag"

RDEPENDS:${PN} += "libgsttag-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
