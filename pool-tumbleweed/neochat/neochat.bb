SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for instant \
messaging."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.3"

RPM_NAME = "neochat-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c0d532aa57bf72047e1762bc64531c44dafaf5dc7ae7f860874461ff296dc77d48d6d8d5036842d1d415c11965a13eb4d678dffb0b12c98842af52ffc3eed086"

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
libQuotient.so.0.6 \
libc.so.6 \
libcmark.so.0.30.3 \
libm.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6 \
syntax-highlighting-imports"

inherit rpm
