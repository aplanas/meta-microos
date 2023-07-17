SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "733a52cc4afc58f39ccf2f4348ed223fe1eb8e837b17eba827e5c0ebef70c3194c5d153069b08bc92efcc6993a5bf70cb8bfcceddf79cfd1b696dcb2fa81885f"

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
