SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "519077d1765db61d50af704d7555df68910eb0d6bf7da2a7056bcdbdd1e9232611b66065002d23c1490c727cd9fcd4533e009ffa60ec9b9c86660c00cecccb27"

RPROVIDES:${PN} += "typelib-1-0-GstCuda-1-0 \
typelib-GstCuda"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0 \
typelib-CudaGst \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
