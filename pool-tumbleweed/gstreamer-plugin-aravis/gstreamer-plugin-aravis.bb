SUMMARY = "Gstreamer support for aravis"
DESCRIPTION = "This package contains the gstreamer plugin for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "gstreamer-plugin-aravis-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "aacabd0f7d71b3fb958d5cd207e7da2c6f841752767039518819d2d3a0622a759cd85a8e9f2229c56833d40bc6a8d6ebb053c4fecb5ae58ff2885afa37f3b209"

RPROVIDES:${PN} += "gstreamer-plugin-aravis \
gstreamer1 \
libgstaravis.0.8.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
