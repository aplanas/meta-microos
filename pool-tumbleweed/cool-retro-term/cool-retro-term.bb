SUMMARY = "Terminal emulator which mimics old screens"
DESCRIPTION = "cool-retro-term is a terminal emulator which tries to mimic the look and feel \
of the old cathode tube screens. It has been designed to be eye-candy, \
customizable, and reasonably lightweight."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "cool-retro-term-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "6afbaec59882a48a00ab8ba63143d58590eae54508bfa2cbf31b337a8ecc742dbdcafdae428196018e8093b8792f10b5008ad73d26addaf4d7ee79bc2abe5595"

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
libstdc++.so.6 \
qt5qmlimport-QMLTermWidget.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
