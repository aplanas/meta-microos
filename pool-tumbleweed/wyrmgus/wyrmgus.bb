SUMMARY = "Game engine for Wyrmsun"
DESCRIPTION = "Modified Stratagus engine for Wyrmsun"
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-5.3.6-3.1.aarch64.rpm"
RPM_HASH = "4de098f35a7ccd665b5f2efd8c6545dff7b0411bdf3cc5083c764d788c1bf0fc92a6221aed2bc50de1d28634f8b35943a18eda2b2d1ea250213b2ccf8be3b30d"

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
