SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWireDmaBuf5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "be1b2d71bda5ca7f40a9d12810e07962c8bbffe63fc4dce11eb062defa197b22b98bf6cd3237dd6f469379c755ae2b6fa2687213389da9d200a71146da3cea34"

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
