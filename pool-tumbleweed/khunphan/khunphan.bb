SUMMARY = "Traditional Thai Puzzle Board Game in 3D with Wooden Blocks"
DESCRIPTION = "The goal of this game is to move the biggest token to a specific \
position. A tutorial and solution hint is available for beginners. The \
game is visible as a three-dimensional model with different camera \
positions. All movements, including the menus, are physically \
calculated. \
 \
Different themes, like wood, rock, metal, marble, bubbles, and \
painting, are available. Themes influence both the display and the \
sound effects. Ambient and Drum & Bass music from Nifflas \
(www.nifflas.com) gives the game a unique atmosphere."
LICENSE = "GPL-2.0+"

PV = "0.55"

RPM_NAME = "khunphan-0.55-477.24.aarch64.rpm"
RPM_HASH = "9c8adc05101981ceb33819074a80048849b960e6c33251d0e5b914d16c3db2906e39e11aa87b382b91a31e69f5beec73f3533cf19cac40f3712130bd54a4b343"

RPROVIDES:${PN} += "khunphan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2 \
pwdutils"

inherit rpm
