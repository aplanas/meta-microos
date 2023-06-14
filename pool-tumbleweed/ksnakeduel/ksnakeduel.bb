SUMMARY = "Simple snake duel game"
DESCRIPTION = "KSnakeDuel is a simple snake duel game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksnakeduel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d541c269229b35486e2342ad6fdc68bda4139e6b394b3b08efe03fc165a20ac2674b95a7bd5c184018c9197be9749246958951b197b583b80972e19eff9b189f"

RPROVIDES:${PN} += "ksnakeduel \
ksnakeduel5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
