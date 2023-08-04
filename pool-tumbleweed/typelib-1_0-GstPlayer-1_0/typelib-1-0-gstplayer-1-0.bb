SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "754487dfc2acabb63817fbe39f8dcd9160adaac1c3e82a7a840e01f6e0d8ffa5af739f9029d0f3e41f63fea8a4a278ee6198db4d6f1f4f8fc9a005acd300af19"

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
