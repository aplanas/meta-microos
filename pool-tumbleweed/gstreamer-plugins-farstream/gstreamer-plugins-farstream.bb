SUMMARY = "GStreamer Plug-Ins for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "gstreamer-plugins-farstream-0.2.9+5-2.4.aarch64.rpm"
RPM_HASH = "b4209d9a3f5ad6619339771b2295471583e239d17d2ab1f844a0c4c1d957e99cd9dbc1647f1a3dd8dfe160165c2880e751fb609b580bafb24eb73cf1dd3fdde9"

RPROVIDES:${PN} += "gstreamer-plugins-farstream \
libfsrawconference.so \
libfsrtpconference.so \
libfsrtpxdata.so \
libfsvideoanyrate.so"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfarstream-0.2.so.5 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libm.so.6"

inherit rpm
