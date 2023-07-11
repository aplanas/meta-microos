SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "55fcad8925cee6c8d57c7487802425c58422ada6024c33cea67138a04c339f14dc4fa4eeae7bbf80303e1cb0e298931d0492e8db95815705139a1a91fc4d35d2"

RPROVIDES:${PN} += "qt6-multimedia-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6SpatialAudio.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
