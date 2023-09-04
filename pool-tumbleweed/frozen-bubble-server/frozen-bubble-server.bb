SUMMARY = "Puzzle with Bubbles - Server"
DESCRIPTION = "Server for frozen-bubble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-server-2.212-15.5.aarch64.rpm"
RPM_HASH = "95fcc913cc5e10166548dcac33a42da3b90abf729f245732be5e7a710f0209be829dcdf135c38191028781c4b6184efc987e06935c596bcac55eab0cb5c41d1d"

RPROVIDES:${PN} += "config-frozen-bubble-server \
frozen-bubble-server"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
systemd"

inherit rpm
