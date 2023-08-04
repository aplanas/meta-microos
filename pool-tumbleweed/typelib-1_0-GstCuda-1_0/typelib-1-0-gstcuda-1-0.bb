SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "6dc7da5064a1c6c780de5ffd2b449eae95e621364957cfe0f93cb694be69f0db3f38c0f9de25a5710cd1797ce5bb77bbfbd880aec95e9e1775259354c9f905b5"

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
