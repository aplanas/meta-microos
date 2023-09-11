SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for instant \
messaging."
LICENSE = "BSD-2-Clause & GPL-3.0-only & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "neochat-23.08.0-2.1.aarch64.rpm"
RPM_HASH = "88542e9cf3939f14c1bc52d074e57bc4109bca9b8acfee23f5a02325fd1767ef448f22ce5a233d71c0182d4c95697b31d6b68637ec6b336d1bf296d904015e72"

RPROVIDES:${PN} += "neochat"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kitemmodels-imports \
kquickimageeditor-imports \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kirigami2.so.5 \
libKF5Notifications.so.5 \
libKF5SonnetCore.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libQuotient.so.0.8 \
libc.so.6 \
libcmark.so.0.30.3 \
libm.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6 \
qt5qmlimport-QtLocation.5 \
qt5qmlimport-QtPositioning.5 \
qt5qmlimport-org.kde.quickcharts.1 \
syntax-highlighting-imports"

inherit rpm
