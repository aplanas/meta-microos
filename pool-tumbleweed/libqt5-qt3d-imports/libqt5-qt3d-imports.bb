SUMMARY = "Qt 5 3D Library - QML imports"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "6aaa2a43e6114364ae05f6e711363211a430c1adb7f04d7fb555e5c9450d5e9bfd4d098e3118b4471d4837fc90815b1b3a712716d88e69e140c5da2b9f8c9323"

RPROVIDES:${PN} += "libqt5-qt3d-imports \
libqtquickscene2dplugin.so \
libqtquickscene3dplugin.so \
libquick3danimationplugin.so \
libquick3dcoreplugin.so \
libquick3dextrasplugin.so \
libquick3dinputplugin.so \
libquick3dlogicplugin.so \
libquick3drenderplugin.so \
qt5qmlimport-Qt3D.Animation.2 \
qt5qmlimport-Qt3D.Core.2 \
qt5qmlimport-Qt3D.Extras.2 \
qt5qmlimport-Qt3D.Input.2 \
qt5qmlimport-Qt3D.Logic.2 \
qt5qmlimport-Qt3D.Render.2 \
qt5qmlimport-QtQuick.Scene2D.2 \
qt5qmlimport-QtQuick.Scene3D.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DQuick.so.5 \
libQt53DQuickAnimation.so.5 \
libQt53DQuickExtras.so.5 \
libQt53DQuickInput.so.5 \
libQt53DQuickRender.so.5 \
libQt53DQuickScene2D.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
