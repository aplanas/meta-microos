SUMMARY = "Qt5 3D examples"
DESCRIPTION = "Examples for the libqt5-qt3d module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qt3d-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d5f5b6f9c8fd6c37535b4024d981eb242f40be707d1f303dac766698e7f6ece7a629b7fcc51f2bf7c2ef2d4b9bc9c2e9ee751ccef04e34e3647e57f4ac3dd737"

RPROVIDES:${PN} += "libqt5-qt3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DQuick.so.5 \
libQt53DQuickExtras.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt3D.Core.2 \
qt5qmlimport-Qt3D.Extras.2 \
qt5qmlimport-Qt3D.Input.2 \
qt5qmlimport-Qt3D.Logic.2 \
qt5qmlimport-Qt3D.Render.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Scene2D.2 \
qt5qmlimport-QtQuick.Scene3D.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
