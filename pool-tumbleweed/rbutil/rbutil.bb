SUMMARY = "Rockbox Firmware Manager"
DESCRIPTION = "Firmware manager for Rockbox MP3 players."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "rbutil-1.4.1-1.21.aarch64.rpm"
RPM_HASH = "a7fd9af0f077fa2f578a77966f815ebc8b725b58a90c25b43903f206f95e535665c4ec6dbcd0a7d77bfda3ff3ede9d75851fb6f4031e6618a48370c1d06c5244"

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
