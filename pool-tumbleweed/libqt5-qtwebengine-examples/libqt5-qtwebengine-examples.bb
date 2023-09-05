SUMMARY = "Qt5 WebEngine examples"
DESCRIPTION = "Examples for the libqt5-qtwebengine module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtwebengine-examples-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "b3b73711a684c05f240c7146866d33af130af75c3d112b10fabc2932d3cad5f74d1b5a0268e7256102992ce369ca1e6cd9c7fccf035b9d4f9072c03586916121"

RPROVIDES:${PN} += "libqt5-qtwebengine-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1"

inherit rpm
