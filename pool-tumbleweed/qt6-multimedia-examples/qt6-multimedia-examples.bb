SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1ebef9ae1b845a0982759253bfc0dbb116dc95b8e1566e553228778d5c3a502fe6d95bdc5e00655060cbfd8362bb6c7d18a8b462b68f5489430451b25842782c"

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
