SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "b535cc9aef97d5321b59578c395240f503fb15c65343b0ea3a55619ace364768bcb7c1c5eebd1198d646582bc02dc19e1c9762f1c8ebf71048e65a4126039e17"

RPROVIDES:${PN} += "typelib-1-0-GstMpegts-1-0 \
typelib-GstMpegts"

RDEPENDS:${PN} += "libgstmpegts-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
