SUMMARY = "Bounce ball game"
DESCRIPTION = "Your task in KBounce (Jezz Ball) is to catch several moving balls in a \
rectangular game field by building walls. The motivation consists of \
finding new and advanced strategies to catch as many balls as possible."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kbounce-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ad9d3ec864f94b67bd2629b90ff3ef99c5fbd07e3f52c88b3a26d96f8f6758be5aea6df3e14d7e1235cb7d8b553fbac480fee87fa3faf045b2cad1674371684f"

RPROVIDES:${PN} += "kbounce \
kbounce5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
