SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstfft-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "c793b38d3ca91c243ba0d0a84fca0a7ce6db6c5d7169e6ca2f5e7b2146b4738121f02b791ac343d960ebcf275d8af0fc7439a5b6928850ee0c95872c29bcce97"

RPROVIDES:${PN} += "libgstfft-1-0-0 \
libgstfft-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
