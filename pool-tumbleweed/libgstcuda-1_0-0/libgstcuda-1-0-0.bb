SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstcuda-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "e846e1f52afcaa64975da0fb5a74a32e11efa9e13da5d22143c984b890a40a35d831fc903808e7d900e2f03f6a20f532f1767a88c6a62490d1feeb0d8e193d20"

RPROVIDES:${PN} += "libgstcuda-1-0-0 \
libgstcuda-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
