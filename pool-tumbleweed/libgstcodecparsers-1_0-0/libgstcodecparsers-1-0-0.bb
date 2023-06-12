SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstcodecparsers-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "c54ff685c841cefc61561c5500fe8fc5dd031999896c704f177f4bbb93c253eb2a4540a13b804056d288e41ea0a5bda47ddb54bbbde9e5d4c67563a20ef73f24"

RPROVIDES:${PN} += "libgstcodecparsers-1.0.so.0()(64bit) \
libgstcodecparsers-1_0-0 \
libgstcodecparsers-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm