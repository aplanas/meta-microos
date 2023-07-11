SUMMARY = "Game engine for Wyrmsun"
DESCRIPTION = "Modified Stratagus engine for Wyrmsun"
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-5.3.6-2.6.aarch64.rpm"
RPM_HASH = "dddc9c1e7c3f39a2f0fea8b292d85854aa4f4194d895bf448f8c9bb384f1a5c32a5ac7e969f3f6c0a5357ee92c001a5a850ddddcea12cc90d7d85ae9f35681a5"

RPROVIDES:${PN} += "wyrmgus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtolua++-5.1.so.1 \
libz.so.1"

inherit rpm
