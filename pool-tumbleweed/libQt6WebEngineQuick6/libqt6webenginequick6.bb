SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "01b6868b021fdf841aa16b733da88955f96b272f2e0010bd5e470d1c920ea6972acdd5a07bd466771073eff35bfdb0bc803a5e201351a18c61fc0eac72460813"

RPROVIDES:${PN} += "libQt6WebEngineQuick.so.6 \
libQt6WebEngineQuick6 \
libQt6WebEngineQuickDelegatesQml.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-webengine-imports"

inherit rpm
