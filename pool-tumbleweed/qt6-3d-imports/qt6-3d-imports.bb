SUMMARY = "Qt 6 3D Library - QML imports"
DESCRIPTION = "Qt 6 3D QML imports."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "39bd72ac4b4f71e12641773a450c568df5b5c3c353cab030f7590d28ea96ad0179579d5e45dd40b1db262452a0245e293b1a6546f40aab14fb8a085c9f132a71"

RPROVIDES:${PN} += "libqtquickscene2dplugin.so \
libqtquickscene3dplugin.so \
libquick3danimationplugin.so \
libquick3dcoreplugin.so \
libquick3dextrasplugin.so \
libquick3dinputplugin.so \
libquick3dlogicplugin.so \
libquick3drenderplugin.so \
qt6-3d-imports \
qt6qmlimport-Qt3D.Animation.2 \
qt6qmlimport-Qt3D.Core.2 \
qt6qmlimport-Qt3D.Core.6 \
qt6qmlimport-Qt3D.Extras.2 \
qt6qmlimport-Qt3D.Input.2 \
qt6qmlimport-Qt3D.Logic.2 \
qt6qmlimport-Qt3D.Render.2 \
qt6qmlimport-QtQuick.Scene2D.2 \
qt6qmlimport-QtQuick.Scene3D.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DQuick.so.6 \
libQt63DQuickAnimation.so.6 \
libQt63DQuickExtras.so.6 \
libQt63DQuickInput.so.6 \
libQt63DQuickRender.so.6 \
libQt63DQuickScene2D.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
