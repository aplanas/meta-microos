SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a5b579dc1a6c6a83fbd4ae39a4c48e50b3f2296dfe17a3825fb55339f508df7002778a401d6f3f2f1a336344a12df295a93f4e8beaa2d8932d202786ec6d5bee"

RPROVIDES:${PN} += "typelib(GstCuda) \
typelib-1_0-GstCuda-1_0 \
typelib-1_0-GstCuda-1_0(aarch-64)"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0()(64bit) \
typelib(CudaGst) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstGL) \
typelib(GstVideo)"

inherit rpm
