SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "cc703aa4609abb442d378bf51fa34ae4c7560c015c60eb45fcf6c1ceb93521a0289a0aee801220cba247e92ecf79e9872ee8d0ddb616663ed695c5906e5fb41d"

RPROVIDES:${PN} += "typelib-1-0-GstPlayer-1-0 \
typelib-GstPlayer"

RDEPENDS:${PN} += "libgstplayer-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo"

inherit rpm
