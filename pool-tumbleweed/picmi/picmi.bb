SUMMARY = "Nonogram Logic game"
DESCRIPTION = "A nonogram logic game by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "picmi-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "34c5c5f3f4273e46ccd9272d4306b2416e2b5470f9ed5e9fc9679f257a4d8c636b60ffa097333287d4803824fe82cfb6283a3915d819266318a4981d5616a0af"

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
