SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "libKPipeWireDmaBuf5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "7fa755fa9dc43e8870cd4c396419c0adb6fa24122819b2c3c632b055964950ab0f6ac784731eb072c0a9e215756563de0e6815b6e37e3087ff398be27ddbb457"

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
