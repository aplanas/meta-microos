SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstcodecs-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "131533d59dc05cc45ed79f145150c7028e7c4adf67fa5898e1677d63fd09ad6783ff988850b919cf9657a07a63e16f391a001a7c134fadb7388bcba6647365f3"

RPROVIDES:${PN} += "libgstcodecs-1.0.so.0()(64bit) \
libgstcodecs-1_0-0 \
libgstcodecs-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstcodecparsers-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit)"

inherit rpm
