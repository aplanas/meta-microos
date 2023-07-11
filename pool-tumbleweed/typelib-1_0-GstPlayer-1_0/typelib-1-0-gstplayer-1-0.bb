SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "52b38a678459df7f59945cbe19312ec0d392b16f0be2e57bc785959554080142b55ac2feaa7a3f9e67f5d0d7f63acbb046eb0eddc027cec4e239e771d1c3e378"

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
