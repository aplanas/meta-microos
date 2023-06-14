SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstwebrtc-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "eec6b8f84736842ca6bf563ca63a75336c878e1a99ebfd898deef169ed65301b86c447e6ad525335c454e453f75c077ae0a11f3c279e02c9c2e9b34cff1232ba"

RPROVIDES:${PN} += "libgstwebrtc-1-0-0 \
libgstwebrtc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
