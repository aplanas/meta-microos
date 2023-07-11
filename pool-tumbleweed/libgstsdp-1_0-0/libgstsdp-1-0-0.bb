SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstsdp-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "68a5ad83990a0bdf0fa2554130ff5fa8b89803368f65848043685f1c2e725fc799a4bbc58c4172be1c1cb10e20991f964c5f8ddef782b37197bef68668aecbc8"

RPROVIDES:${PN} += "libgstsdp-1-0-0 \
libgstsdp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0"

inherit rpm
