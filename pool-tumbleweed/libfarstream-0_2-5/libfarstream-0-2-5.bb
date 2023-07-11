SUMMARY = "GStreamer modules and libraries for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "libfarstream-0_2-5-0.2.9+5-2.4.aarch64.rpm"
RPM_HASH = "ce9ac1e097839ef85d6770e6ecc93326624efc120ec90f59f0814010eae9187ad3ca3e3de3ed0276eb9f4ea09525c6dbe8213e1bf58e354ef8b011b412a55bf9"

RPROVIDES:${PN} += "libfarstream-0-2-5 \
libfarstream-0.2.so.5 \
libmulticast-transmitter.so \
libnice-transmitter.so \
librawudp-transmitter.so \
libshm-transmitter.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
farstream-data \
gstreamer-plugins-farstream \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
libnice.so.10"

inherit rpm
