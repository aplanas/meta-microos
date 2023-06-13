SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstcuda-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "127d4048e3e23286984589c66084ae21960cd2ed1fd03345f9779026cdb28c11fddf417f9e0554bc65426e0d55fdba9935b74345b366a4ea85fde989115bff19"

RPROVIDES:${PN} += "libgstcuda-1.0.so.0()(64bit) \
libgstcuda-1_0-0 \
libgstcuda-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit)"

inherit rpm
