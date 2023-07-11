SUMMARY = "Mastodon client by KDE"
DESCRIPTION = "Tokodon is a Mastodon client. It allows you to interact with the Fediverse \
community."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "tokodon-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "123218b0c001ca949aec3d7f26a38b19cc8d28fe3ba40abeb612da6462be6319ba2a11d66c9745b639c7dbb1e65a5476dfdea47129c1dac86e12e0d804f833ff"

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
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
sonnet-imports"

inherit rpm
