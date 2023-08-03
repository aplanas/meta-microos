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

PV = "1.22.5"

RPM_NAME = "typelib-1_0-Gst-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "6521cf6f1fd9610992c2c67fd798140ca9ba200e4c4d4ef079cea948a352dbccaedd2d7ac257d29bc98c3f2fb6fffee0550a01648edcc0798d535596f8297d96"

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
