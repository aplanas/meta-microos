SUMMARY = "Qt 6 Quick3DPhysics QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3DPhysics module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b1fc52c6733089d8927313391acb13b6fb08ea0d13037bfc0a95bdd41ece44708bbb662fc333f0222b3619ab10cc87599a242ba21c7362c89968be980400c709"

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
