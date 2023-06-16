SUMMARY = "Helper for debugging and reporting crashes"
DESCRIPTION = "The KDE Crash Handler gives the user feedback if a program has crashed."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "drkonqi5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "6993ddffc96f85e44fa271f0e3f90cbb18c4ee9a3725ea372ecb32233c52e3e18391484984d6600df61882527787f6b946ce0cb4fcab77f5dc2cbb8a37b5e3d7"

RPROVIDES:${PN} += "drkonqi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKUserFeedbackCore.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
