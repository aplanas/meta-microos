SUMMARY = "2D Arcade Beach Volleyball Game"
DESCRIPTION = "Blobby Volley is one of the most popular freeware games. This is caused \
first by the simple play principle and second by the funny design of \
the player. The short duration of a game is a reason for playing this \
game in meantime."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "blobby-1.0-2.13.aarch64.rpm"
RPM_HASH = "5bfec5b85eb437da0ae41f6789e2739d6b71b7cac3742a007a842db1669954434ed282d104eec666a5ef90ae5a94d2304f3768b4c706461268fb3f7d040cbfda"

RPROVIDES:${PN} += "blobby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphysfs.so.1 \
libstdc++.so.6"

inherit rpm
