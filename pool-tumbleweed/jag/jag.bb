SUMMARY = "Arcade and Puzzle 2D Game in which you have to break all the target pieces"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-0.3.8-2.12.aarch64.rpm"
RPM_HASH = "60fab713695f507221e7789cd71323b5a920b1a008da301cf78d7cdfdf0fd4e3a0dc818fe01336e64049388967a5c5f7ecba4e2000e646929e33930159327235"

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
