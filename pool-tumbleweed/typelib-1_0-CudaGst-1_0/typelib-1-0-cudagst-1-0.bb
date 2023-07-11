SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "384adccc8f1b1ccea3137251fc711588a6625b500e7301e713efe832038be22f6b72ad8838ae1ae1f983fe80315dbe8ae2e9ea30db50523c4ea9f5035b570b00"

RPROVIDES:${PN} += "typelib-1-0-CudaGst-1-0 \
typelib-CudaGst"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0"

inherit rpm
