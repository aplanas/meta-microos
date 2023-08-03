SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "74c12b1555936fd14bfa1696f0e68183f1c192fbc756270f667d5986efe6793ec70804cc7be3151c065a8b1144e40a546aff75b8efc521997e9f2d2b10b0072b"

RPROVIDES:${PN} += "typelib-1-0-CudaGst-1-0 \
typelib-CudaGst"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0"

inherit rpm
