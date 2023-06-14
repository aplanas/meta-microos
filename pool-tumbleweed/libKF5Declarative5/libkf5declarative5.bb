SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Declarative5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "a8186e059981c2015f41cb6e24973d4b099e4241159495a423fcfa618cffd9a45a58967a23ec75406703c4248dd8f504cd30efcdd49fc4773d56bcef07fabdfe"

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
