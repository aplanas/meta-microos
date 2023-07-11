SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "1c013306b00453af4a745ac00984c64158978ddd381f94d19992a203811726cf21f8b626aa9571b579dcede6b29517b51853136c847cafc76a4eb5b212777041"

RPROVIDES:${PN} += "typelib-1-0-GstMpegts-1-0 \
typelib-GstMpegts"

RDEPENDS:${PN} += "libgstmpegts-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
