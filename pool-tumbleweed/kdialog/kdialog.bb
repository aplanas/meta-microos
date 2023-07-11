SUMMARY = "KDE version of xdialog"
DESCRIPTION = "KDialog can be used to show nice dialog boxes from shell scripts."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdialog-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1e5ace405673ca1a10cb6627b291595ad4c0c891925c6aaf7014471b73131a6932646217123e9ef32139bfcfcf7079db80600785c672c934a9c4eda226f42e5d"

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
