SUMMARY = "Simple snake duel game"
DESCRIPTION = "KSnakeDuel is a simple snake duel game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ksnakeduel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6945248268034c6c74f1d14f2c8808ca31aa7ce8e97de8588c9dd8c2d0c8e6977e5134526a73ef6e6633f058054d4fc940b22563bbcc4b9ffc829f405f070984"

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
