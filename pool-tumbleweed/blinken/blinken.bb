SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "blinken-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1f1677a0ba4e16f4a04385561082b4c56154ea5d8755e0845eaf218eb96520c31c31d6b6050409c28f20c132869ab9e579bbb8ca44f340175c335228bf7a45dd"

RPROVIDES:${PN} += "blinken \
blinken5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
