SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstsdp-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "abe736a80ae35fc1ca528287dcae539211bc8b982cba4695ffbb93fd591b09335fd968d64fc6cce92a41567468348a31b97680dc00d00f6cb1e67fcae199db48"

RPROVIDES:${PN} += "libgstsdp-1.0.so.0()(64bit) \
libgstsdp-1_0-0 \
libgstsdp-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtp-1.0.so.0()(64bit)"

inherit rpm
