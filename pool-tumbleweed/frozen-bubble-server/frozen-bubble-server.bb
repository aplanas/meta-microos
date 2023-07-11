SUMMARY = "Puzzle with Bubbles - Server"
DESCRIPTION = "Server for frozen-bubble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-server-2.212-15.4.aarch64.rpm"
RPM_HASH = "b81d356b054ca95b601f59e1931672e0a2b000bd0a3c2cea1baae3991a8663b8d83e97c3071f586c1ca3e1821ebbf5b566a1c81404d7973c0cb44841f8e8bbba"

RPROVIDES:${PN} += "config-frozen-bubble-server \
frozen-bubble-server"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
systemd"

inherit rpm
