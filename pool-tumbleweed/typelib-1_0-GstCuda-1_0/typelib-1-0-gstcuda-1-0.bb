SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "9d447c2912ef9a1253787dc597eccde7023df98bd5c4a9b237a2d6a57170729b9add8af8a353e1db675308c2b9bf2d9928b78619e13901e50dec03acc79b0dbf"

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
