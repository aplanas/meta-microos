SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstfft-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "00e4a477376300c8edad4562f3613900034a00f41dc0b4996d24c8567dcbaaa7e57534e22e1620ca2706c4bef48ede7190c1ef35d7afd68394e21968a6ca490d"

RPROVIDES:${PN} += "libgstfft-1-0-0 \
libgstfft-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
