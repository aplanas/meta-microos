SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6SpatialAudio6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7bb39f1e736b35ee02d980303fb684c62a67fc8dcb30d7525cfbb679deb9e69ef2568b9b764729120d1e23188f6eb24efa4773777a6b4dfd648acf8103b7e52b"

RPROVIDES:${PN} += "libQt6SpatialAudio.so.6 \
libQt6SpatialAudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
