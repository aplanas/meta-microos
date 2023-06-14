SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for instant \
messaging."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "neochat-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a57b4b896afe31da24833064331d583d5953f3f74158cdd0cc1f244867bb05e85c970f671db49dcaf18166bc7f89a387af6d6a0ea5084728de2c271c90864820"

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
