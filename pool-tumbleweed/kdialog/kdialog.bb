SUMMARY = "KDE version of xdialog"
DESCRIPTION = "KDialog can be used to show nice dialog boxes from shell scripts."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdialog-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5dbb0d140b3a0c3afb3a88643f03985c10a1c18010535129669285f36b9bbc458657b0b9731c50bc3ca87977de592e1bb4212808ff3c405d9c1c39ec26d76847"

RPROVIDES:${PN} += "kdialog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5Notifications.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
