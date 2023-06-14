SUMMARY = "Nonogram Logic game"
DESCRIPTION = "A nonogram logic game by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "picmi-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1f56bd6cccf8cf5b9de4ba68e6610aaf2a55fd1ca9c13d784099eae6ddf6b952bbcc22365cf6f4e7a35248e74464be03255141b0be8e1753c47714d8b8dbd8fb"

RPROVIDES:${PN} += "picmi \
picmi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
