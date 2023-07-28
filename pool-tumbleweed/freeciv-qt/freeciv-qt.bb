SUMMARY = "Qt client for freeciv"
DESCRIPTION = "Freeciv executable using Qt library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "freeciv-qt-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "9f2c823080066a0be45b0c0b392c762be130ebc53c67b20a95fdf2f5403a67600f9cde007fde2a1c83213515f384e0bf951cfe0b0554c3b607dec33e99611d9a"

RPROVIDES:${PN} += "freeciv-client-3.0.8 \
freeciv-qt"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
