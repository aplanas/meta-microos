SUMMARY = "Third-person ninja rabbit fighting game"
DESCRIPTION = "Lugaru is the predecessor to Overgrowth (http://www.wolfire.com/overgrowth). \
It is a third-person action game. The main character, Turner, is an anthropomorphic \
rebel bunny rabbit with impressive combat skills. In his quest to find those responsible \
for slaughtering his village, he uncovers a far-reaching conspiracy involving the corrupt \
leaders of the rabbit republic and the starving wolves from a nearby den. Turner takes it \
upon himself to fight against their plot and save his fellow rabbits from slavery."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "lugaru-1.2-2.23.aarch64.rpm"
RPM_HASH = "58a953d63ca4b6e4b361fea68482068ccf998c4c67b38ab2311d027a295307a7a1c9904c8d3c0fadb0932930e9154c48dae9aadda438ef187ebeac81011b370b"

RPROVIDES:${PN} += "lugaru"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libvorbisfile.so.3 \
lugaru-data"

inherit rpm
