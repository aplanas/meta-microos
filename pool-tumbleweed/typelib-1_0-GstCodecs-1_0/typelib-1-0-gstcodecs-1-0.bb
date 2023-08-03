SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "060c9d7d35191df3061c2a24af5561c2be5802892cba4b4895faa33a661acf1dbf83f4778ad23c1761cfd1b086196af48af9484119afef0c923f0fc06c758fec"

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
