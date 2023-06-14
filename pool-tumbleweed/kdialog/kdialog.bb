SUMMARY = "KDE version of xdialog"
DESCRIPTION = "KDialog can be used to show nice dialog boxes from shell scripts."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdialog-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "045c2b020a3a9d226e80ee64ce649aba767429ad136dc8fa96dfe91fcbd2385aa9c43b0e36c0af5888cb8dd3c7033e8fe9cccc943c25052717ff17762bda92f6"

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
