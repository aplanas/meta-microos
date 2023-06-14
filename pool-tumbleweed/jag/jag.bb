SUMMARY = "Arcade and Puzzle 2D Game in which you have to break all the target pieces"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-0.3.8-2.11.aarch64.rpm"
RPM_HASH = "df57d3ed34a470ab2c72fd2eb660e7d9c5c1dfd3a82bf790997c64b13c3700fefe4b2ffbae555b407f0bf9f4d1d75ba5e6592eaa41d9c66692581d176608aba6"

RPROVIDES:${PN} += "jag"

RDEPENDS:${PN} += "jag-data \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
