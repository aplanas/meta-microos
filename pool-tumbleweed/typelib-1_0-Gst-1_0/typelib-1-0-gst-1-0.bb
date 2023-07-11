SUMMARY = "Streaming-Media Framework Runtime -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-Gst-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "1d991be98534e47cb55a7c938bba91ca72bd5b44859214a9b3f1f3fb7d4ed0017f522fb5f8f590e99d1fe36764ee3de1c8c3d3d6c043357b2ca46f94d27b154c"

RPROVIDES:${PN} += "typelib-1-0-Gst-1-0 \
typelib-Gst \
typelib-GstBase \
typelib-GstCheck \
typelib-GstController \
typelib-GstNet"

RDEPENDS:${PN} += "libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
