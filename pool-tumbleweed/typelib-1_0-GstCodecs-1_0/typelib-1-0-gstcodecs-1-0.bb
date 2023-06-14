SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "28c3a22e19e178e9bf0359eca9797b9af10cf3d055c1b3b3fd34c95c3f8156e96b3fcdaaa64df6a0d5d556af5d2ab3285b62c0b2d8b3e13afe0e15bb0dd579f7"

RPROVIDES:${PN} += "typelib-1-0-GstCodecs-1-0 \
typelib-GstCodecs"

RDEPENDS:${PN} += "libgstcodecs-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
