SUMMARY = "KDE Power Management module"
DESCRIPTION = "KDE Power Management module. Provides kded daemon, \
DBus helper and KCM for configuring Power settings."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "powerdevil5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "84e7571d96bf1eefcb7de422567ed9509dd203a23c22c8f07e09d906b1248a0eaac21b4e8955b447165e80281edecaae4e273fc43a3fc1d2a2e054fbf8762eff"

RPROVIDES:${PN} += "libpowerdevilconfigcommonprivate.so.5 \
libpowerdevilcore.so.2 \
libpowerdevilui.so.5 \
powerdevil5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5AuthCore.so.5 \
libKF5BluezQt.so.6 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kirigami2.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Screen.so.8 \
libKF5ScreenDpms.so.8 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libkworkspace5.so.5 \
libstdc++.so.6 \
libudev.so.1 \
libxcb.so.1 \
plasma5-workspace-libs \
systemd"

inherit rpm
