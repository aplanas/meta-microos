SUMMARY = "Game engine for Wyrmsun"
DESCRIPTION = "Modified Stratagus engine for Wyrmsun"
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "251c68ce336923c3124dfd37e8b2190c18abf2c1e632acb6e9e127baa3651607bffb1cb0b0887282cd191d394ff5761581b902d26860c88327348de5ae9bcf44"

RPROVIDES:${PN} += "wyrmgus \
wyrmgus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtolua++-5.1.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
