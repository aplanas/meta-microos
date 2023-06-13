SUMMARY = "SDL Bomberman clone"
DESCRIPTION = "This is a SDL Bomberman clone. \
 \
You've got to blow up other players to win. Spacebar drops a bomb. Get away \
and hope your enemy gets hit by the flame. The 'b' key is a 2nd control \
for when you are lucky enough to pick up the bomb control--looks like a \
bomb with a timer on it. When you have that the bomb won't go off until \
detonated by another bomb, you are killed, or you press 'b'. \
 \
Blowing up bricks might result in prizes, most of which are good. \
Skates = speed up \
Bomb = allow you to have one more active bomb \
flame = Increase bomb strength \
turtle = makes you move very slowly \
bomb with timer = controlled bomb detonation with 'b' key. \
gold flame = Set flame strength to max \
 \
There isn't much point in playing the game alone (single player). In that \
case the only thing to avoid is accidentally killing yourself. Big deal... \
It's really a multiplayer game."
LICENSE = "GPL-2.0+"

PV = "1.0.4"

RPM_NAME = "sdl_bomber-1.0.4-1.28.aarch64.rpm"
RPM_HASH = "0a10bfd540f68d06953f9961e3a768c48ea454a41fc1d2481f2163b55563b03c9f04bb1895b88d19a29ce40f6d53d462748a1941dba131d3648597da9272b1a6"

RPROVIDES:${PN} += "application() \
application(sdl_bomber.desktop) \
sdl_bomber \
sdl_bomber(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit)"

inherit rpm
