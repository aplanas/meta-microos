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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "b9d52327ac528a8c3919671375ac67b464594c00e9bda93eb7df077dc99960ad4852a7324c5a48cfe82d1697e9ce6f53830bb53385e7441c6ede992628e1a494"

RPROVIDES:${PN} += "typelib-1-0-GstPbutils-1-0 \
typelib-GstPbutils"

RDEPENDS:${PN} += "libgstpbutils-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
