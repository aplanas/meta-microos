SUMMARY = "Space Arcade game"
DESCRIPTION = "KSpaceduel is a space arcade game for two players. However, one player \
can be controlled by the computer. Each player controls a satellite \
that flies around the sun. While doing so both players try not to \
collide with anything but shoot at the other space ship."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kspaceduel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "25ee4e30c328423a5fd8a413c28bca4b41bde9893196c8b81a09723a3b6e77e277d723a2997253c05786527007e94f9fd23bff4ccaba2c8f7e146df97fe2530f"

RPROVIDES:${PN} += "kspaceduel \
kspaceduel5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
