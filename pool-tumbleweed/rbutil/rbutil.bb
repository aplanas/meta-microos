SUMMARY = "Rockbox Firmware Manager"
DESCRIPTION = "Firmware manager for Rockbox MP3 players."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "rbutil-1.4.1-1.22.aarch64.rpm"
RPM_HASH = "2d9779f41486ed6f1778b1139e56912c1a6930ada034310093983d5bea57b5136176ea250cf17164d784d056541729ec0a273092de7d9a032705f9272b27db9b"

RPROVIDES:${PN} += "rbutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcryptopp.so.8.8.0 \
libgcc-s.so.1 \
libspeex.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
