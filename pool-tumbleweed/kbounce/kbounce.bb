SUMMARY = "Bounce ball game"
DESCRIPTION = "Your task in KBounce (Jezz Ball) is to catch several moving balls in a \
rectangular game field by building walls. The motivation consists of \
finding new and advanced strategies to catch as many balls as possible."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kbounce-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cb586a1286c1400877fed5b33ac4dc43c554947fb4ed0c172e3f0cc041f851a193884401e8cfb32243a893e9732d58110623639eba267367be8ef11c260708e0"

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
