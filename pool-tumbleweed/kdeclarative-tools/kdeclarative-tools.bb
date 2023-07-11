SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdeclarative-tools-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "64c5aae89cd5d8df96ba8c35c7cdc055fa389f8bfa4bf3a592e819c8a9b7ed3220f2764e182efeee4c95fb3c42c3e62e2edf14aaada1bc66b32e0bd86f7cbe89"

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
