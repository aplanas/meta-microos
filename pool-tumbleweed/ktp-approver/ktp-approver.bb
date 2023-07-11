SUMMARY = "Channel Approver for KDE Telepathy implementation"
DESCRIPTION = "A channel approver for KDE's Telepathy implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-approver-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f21953c7d979b200c307e5a5945ead81be70a21e9ee437ccf1350df50b71d8b6a3379b4123aa4c94839075e4d60f3c08e3fc7555e2a48b1ed3442d631ad8663e"

RPROVIDES:${PN} += "config-ktp-approver \
ktp-approver \
ktp-approver5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
