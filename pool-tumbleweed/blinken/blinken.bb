SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "blinken-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "faf1927caa26cbd074ff68d246e59f168e7603874b655f36953e790b2358f414ed317b6e45e12483b9ccdd0e0f1a95f176cca675e55c48c65cdb986a12f233ff"

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
