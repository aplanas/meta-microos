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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "a31157abb5a9e3f2a317f5362b4f0d7c51c6cbe1a712cb01988706568f923182a6399ccb52628af83438f8b56c740a89c406c752f49ebbfdb5502c9ddac751dd"

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
