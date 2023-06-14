SUMMARY = "OTP client"
DESCRIPTION = "OTP client for Plasma Mobile and Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "keysmith-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "56d1d9fb8b0423d64357638975cb130876b933c12a5ac49f70736db72c6bfbfecd5a080ede13846b4f214a7fea4e29a773155be470d8885227a7d26043c3f7a7"

RPROVIDES:${PN} += "keysmith"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libsodium.so.23 \
libstdc++.so.6"

inherit rpm
