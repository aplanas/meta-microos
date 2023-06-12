SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "4c788c0dfb132832d7a7ab4fabb2eae3bba0aacb521961dc173d0065d7a0cb95002a9bc33ab406f1de70f654096107d71dd167655c9f0e3f13111572b71f1a32"

RPROVIDES:${PN} += "typelib(GstMpegts) \
typelib-1_0-GstMpegts-1_0 \
typelib-1_0-GstMpegts-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstmpegts-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst)"

inherit rpm
