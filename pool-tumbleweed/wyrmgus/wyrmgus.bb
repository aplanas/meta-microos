SUMMARY = "Game engine for Wyrmsun"
DESCRIPTION = "Modified Stratagus engine for Wyrmsun"
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "251c68ce336923c3124dfd37e8b2190c18abf2c1e632acb6e9e127baa3651607bffb1cb0b0887282cd191d394ff5761581b902d26860c88327348de5ae9bcf44"

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
