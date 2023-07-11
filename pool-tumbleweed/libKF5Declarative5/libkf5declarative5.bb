SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Declarative5-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "c41ae2d9fb9fb228d4ac5aad34e8b5b72db3ec84c929af0eb0543e8ff3d545dd7dbdcf5d84f58460f28307141daff9f3d04c1bfcd0d5114090855ccce627a73a"

RPROVIDES:${PN} += "libKF5Declarative.so.5 \
libKF5Declarative5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
