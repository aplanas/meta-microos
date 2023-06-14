SUMMARY = "Miniature golf game"
DESCRIPTION = "Kolf is a miniature golf game by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kolf-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8fcbba26375880626cdac91bebaa5f1e87e1181ac02b33061a93f986898207293c0a15cad7854ad0f77830672f5dfcf01a42d27906779bc7cba42fc56dea44ba"

RPROVIDES:${PN} += "kolf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
