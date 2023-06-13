SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgsturidownloader-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "2002e17f172ce8f0e11c9cdd0e5d95e13fa2e6313184569ba03edfe1cdf76390ed3a99c6e75c782dec6b9dcec427efddbc888a90c364ade96cacff7d95894414"

RPROVIDES:${PN} += "libgsturidownloader-1.0.so.0()(64bit) \
libgsturidownloader-1_0-0 \
libgsturidownloader-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
