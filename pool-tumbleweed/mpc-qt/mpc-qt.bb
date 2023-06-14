SUMMARY = "Media Player Classic Qute Theater"
DESCRIPTION = "A clone of Media Player Classic reimplemented in Qt."
LICENSE = "GPL-2.0-only"

PV = "23.02"

RPM_NAME = "mpc-qt-23.02-1.3.aarch64.rpm"
RPM_HASH = "d645913fa2883fefb59b48136e47839a56db88a6810ab839b3b2d677b7002705dabf6926aa81b1e8c2fe0b01179880e7a9ade52ced9da3b27e1339119131b14f"

RPROVIDES:${PN} += "Classic \
Player \
Qute \
Theater.desktop) \
mpc-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
