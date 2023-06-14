SUMMARY = "Qt 6 Quick3DPhysics QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3DPhysics module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8fd254b946f395f4d7efe6b8e4282edb9740f1bcfc9db0addf0a8dbefcd2c8b11dedff570f937cd7fb1b27e61949c241f9a5f45add60890c613909d1161e997b"

RPROVIDES:${PN} += "libqquick3dphysicsplugin.so \
libqtquick3dphysicshelpersplugin.so \
qt6-quick3dphysics-imports \
qt6qmlimport-QtQuick3D.Physics.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3DPhysics.so.6 \
libQt6Quick3DPhysicsHelpers.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
