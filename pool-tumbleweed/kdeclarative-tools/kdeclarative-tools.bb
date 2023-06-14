SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdeclarative-tools-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "928f8d5370d04b18c5c835ab8032f714a4c1c12e4a283f002547a94f34ebcf855bb73ce8fb6dfd79a86a9ce9f64816c85e25eed0406a8909af8383a3b2dd4d7a"

RPROVIDES:${PN} += "kdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
