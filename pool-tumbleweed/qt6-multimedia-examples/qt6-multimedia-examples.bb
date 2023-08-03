SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7f75679c3c2897f782a62db0ccee7a64744c4237964931434d67121da442c94931c1af37ad30fb8fdc58b8277e8411857ed039388600ea54e3bb25d645a92422"

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
