SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "libKPipeWireDmaBuf5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "c88560b926d1b0a910e8aba03d85d110c11722df305b9154bd67bd7542abd96d2f0a34be8d0150dec755a9dd4af71da23110ea370b9a5ca04c53d0e0e2b20e9e"

RPROVIDES:${PN} += "libKPipeWireDmaBuf.so.5 \
libKPipeWireDmaBuf5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPipeWire.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libstdc++.so.6"

inherit rpm
