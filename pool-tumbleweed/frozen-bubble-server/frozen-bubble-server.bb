SUMMARY = "Puzzle with Bubbles - Server"
DESCRIPTION = "Server for frozen-bubble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-server-2.212-15.3.aarch64.rpm"
RPM_HASH = "6d1e62050c2828d107ec02cc5d5497ec80093c9c0ab30e73ba48ab140512c831dcddadf6ee1d3223932ace6f85eb023df7a7ac878c5a69c30fe7c692f3b4df97"

RPROVIDES:${PN} += "config-frozen-bubble-server \
frozen-bubble-server"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
systemd"

inherit rpm
