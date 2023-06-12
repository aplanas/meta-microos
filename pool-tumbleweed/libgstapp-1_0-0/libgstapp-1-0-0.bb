SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstapp-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "8919ccb8eb7a157d776cab8e82d48eae7a29cf1e25279a0e7d7c8914d98b3e975c49f2c61c19584d72f98f9b0613b7b11adc82dc507137a81ebbde95053883b6"

RPROVIDES:${PN} += "libgstapp-1.0.so.0()(64bit) \
libgstapp-1_0-0 \
libgstapp-1_0-0(aarch-64)"
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
