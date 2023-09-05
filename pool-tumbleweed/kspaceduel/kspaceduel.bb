SUMMARY = "Space Arcade game"
DESCRIPTION = "KSpaceduel is a space arcade game for two players. However, one player \
can be controlled by the computer. Each player controls a satellite \
that flies around the sun. While doing so both players try not to \
collide with anything but shoot at the other space ship."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kspaceduel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "54c3ee52f77ce742a481dedffe2f508ba4273762cc9c0417b2efb35373f8e24570063c7193d8f45431a889fa5a84a8136f726167d3511d817ff15becbf8da92c"

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
