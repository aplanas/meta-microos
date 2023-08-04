SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "dc93e52fee33e22440de2d2d8db67184568a6fbb8647f6d10a730a11538ed225e5a5daf1ac2c123bb7112c4ccd8283e73cc6f9944f073ef07fb5318ebc8cd8a4"

RPROVIDES:${PN} += "typelib-1-0-CudaGst-1-0 \
typelib-CudaGst"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0"

inherit rpm
