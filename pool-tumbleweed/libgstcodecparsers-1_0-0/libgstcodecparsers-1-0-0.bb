SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstcodecparsers-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "9448700671c4f747770dbffd39785f96a99944f49f360a4603b68022747d38cf58c180dd2fdb3aa473a35077acc365680d9b5859bc649680af1d2e50a42da14e"

RPROVIDES:${PN} += "libgstcodecparsers-1-0-0 \
libgstcodecparsers-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6"

inherit rpm
