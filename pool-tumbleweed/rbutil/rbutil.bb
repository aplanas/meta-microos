SUMMARY = "Rockbox Firmware Manager"
DESCRIPTION = "Firmware manager for Rockbox MP3 players."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "rbutil-1.4.1-1.20.aarch64.rpm"
RPM_HASH = "24ee7a50e71038f327fe00d4de8b2a718e42658620418b71bfe8cb511b4ce92ffa0dd4ca3954cd6c32c2c117d9430fa377aee95af11077dd7be46815039bc62d"

RPROVIDES:${PN} += "rbutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcryptopp.so.8.7.0 \
libgcc-s.so.1 \
libspeex.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
