SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for instant \
messaging."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "neochat-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a57b4b896afe31da24833064331d583d5953f3f74158cdd0cc1f244867bb05e85c970f671db49dcaf18166bc7f89a387af6d6a0ea5084728de2c271c90864820"

RPROVIDES:${PN} += "application() \
application(org.kde.neochat.desktop) \
metainfo() \
metainfo(org.kde.neochat.appdata.xml) \
mimehandler(x-scheme-handler/matrix) \
neochat \
neochat(aarch-64)"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kitemmodels-imports \
kquickimageeditor-imports \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQuotient.so.0.6()(64bit) \
libc.so.6()(64bit) \
libcmark.so.0.30.3()(64bit) \
libm.so.6()(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
syntax-highlighting-imports"

inherit rpm
