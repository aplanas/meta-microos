SUMMARY = "OTP client"
DESCRIPTION = "OTP client for Plasma Mobile and Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "keysmith-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2118fdadb87b6c681bef8b185cddf0be01cc5066370625b275e58380ae4a779600ea6488cceed439203b6a24da8ce81a9b8b36efb60b1346f47d14c64a3a1178"

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
