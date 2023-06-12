SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstrtp-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "1b04b9156009b0bb113175e912c5771d39353d6f74c9c6b4ba1b4bfdc529d85fba61bc91c611e9367a11a3224d082b50ec332aa80d61365f7394b27b8a4837aa"

RPROVIDES:${PN} += "libgstrtp-1.0.so.0()(64bit) \
libgstrtp-1_0-0 \
libgstrtp-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
