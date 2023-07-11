SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "536325f34834fd5a6d9f4df80ec4c1560f1f7b6b70aca6601c955a56f0cf7e9eefe706ffef1fd1721236a0c1238294ff9c7825e125cf8b3ab054d8491eb744fa"

RPROVIDES:${PN} += "typelib-1-0-GstPlay-1-0 \
typelib-GstPlay"

RDEPENDS:${PN} += "libgstplay-1.0.so.0 \
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
