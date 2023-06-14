SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "blinken-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "59ce523756d83798227058d7d1699f02e62afb1bec3c40b82247667f4688cac034897f8eae1f8f3600602d4d722f68a05a5f48a548c6fbf93ea826e823dbfde3"

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
