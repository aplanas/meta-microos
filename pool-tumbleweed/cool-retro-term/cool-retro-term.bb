SUMMARY = "Terminal emulator which mimics old screens"
DESCRIPTION = "cool-retro-term is a terminal emulator which tries to mimic the look and feel \
of the old cathode tube screens. It has been designed to be eye-candy, \
customizable, and reasonably lightweight."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "cool-retro-term-1.2.0-3.1.aarch64.rpm"
RPM_HASH = "805d40111ff817ea9b665402e62b2d6287dc9dbc8e39b1d12e586ed61236473a64fb4fda0a3c4fd1d4b3a7364c04ae822a417f3e5c64c2fc60604c1cf6026349"

RPROVIDES:${PN} += "cool-retro-term \
libqmltermwidget.so \
qt5qmlimport-QMLTermWidget.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QMLTermWidget.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
