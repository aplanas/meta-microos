SUMMARY = "Rockbox Firmware Manager"
DESCRIPTION = "Firmware manager for Rockbox MP3 players."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "rbutil-1.4.1-1.20.aarch64.rpm"
RPM_HASH = "24ee7a50e71038f327fe00d4de8b2a718e42658620418b71bfe8cb511b4ce92ffa0dd4ca3954cd6c32c2c117d9430fa377aee95af11077dd7be46815039bc62d"

RPROVIDES:${PN} += "application() \
application(rbutil.desktop) \
rbutil \
rbutil(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcryptopp.so.8.7.0()(64bit) \
libgcc_s.so.1()(64bit) \
libspeex.so.1()(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
