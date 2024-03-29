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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "2dc8f36c8be636c2655e8ec06fb12ce5dbb6b15174cdb1c0b44e370a927a27d175ada880a92ca12ecd5989bfb0d52566ca93cfab3067e77065b992b8893663e9"

RPROVIDES:${PN} += "typelib-1-0-GstTag-1-0 \
typelib-GstTag"

RDEPENDS:${PN} += "libgsttag-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
