SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstfft-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "51fa72208645b8ac7e5bacb64901cbe8c4ca7c05d8079a11e0b01cc24303e7c869e741282a0eb0af6619625da4c1a96ed0681edb25e4500c62e47f66365baff7"

RPROVIDES:${PN} += "libgstfft-1-0-0 \
libgstfft-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
