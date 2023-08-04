SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "347542ea5c71a1957818383f75378ff1e42ceb95a9d0b198315c59c446c3ca532cf06f4bb2c362fe46d7b318a35b95e27498cc53e6c2246035d6f4410efea634"

RPROVIDES:${PN} += "typelib-1-0-GstMpegts-1-0 \
typelib-GstMpegts"

RDEPENDS:${PN} += "libgstmpegts-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
