SUMMARY = "Mastodon client by KDE"
DESCRIPTION = "Tokodon is a Mastodon client. It allows you to interact with the Fediverse \
community."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "tokodon-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8ce5b25a9a6782d644f5815e30b0bdc6286994ad73aa455a5556870420150cf58b64f6c3bad2c3e1049bf6fa4597d6513a7100e13498aee1ef4c5020ea4da158"

RPROVIDES:${PN} += "tokodon"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kitemmodels-imports \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Kirigami2.so.5 \
libKF5Notifications.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libqt5keychain.so.1 \
libstdc++.so.6 \
sonnet-imports"

inherit rpm
