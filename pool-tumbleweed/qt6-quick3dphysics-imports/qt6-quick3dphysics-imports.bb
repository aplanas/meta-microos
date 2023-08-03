SUMMARY = "Qt 6 Quick3DPhysics QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3DPhysics module."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8fcefcc70008ed3109debf0f6e351a34420134913a880d0b9eb1b3187a328e3ae9e402c03e622923db78458c336e4aa117fc577a49f5591ac10daac19886874a"

RPROVIDES:${PN} += "libqquick3dphysicsplugin.so \
libqtquick3dphysicshelpersplugin.so \
qt6-quick3dphysics-imports \
qt6qmlimport-QtQuick3D.Physics.6 \
qt6qmlimport-QtQuick3D.Physics.Helpers.1 \
qt6qmlimport-QtQuick3D.Physics.Helpers.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3DPhysics.so.6 \
libQt6Quick3DPhysicsHelpers.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
