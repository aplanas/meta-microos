SUMMARY = "2D Arcade Beach Volleyball Game"
DESCRIPTION = "Blobby Volley is one of the most popular freeware games. This is caused \
first by the simple play principle and second by the funny design of \
the player. The short duration of a game is a reason for playing this \
game in meantime."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "blobby-1.0-2.12.aarch64.rpm"
RPM_HASH = "e2a23fcbed3db90e7f54e6cb6e11b4201bbf37154d9b2a9a5946b057843538276d511b09ff01de03bf4dcffbbcb6a31a9efb399f0d537dfa785282e0336412a5"

RPROVIDES:${PN} += "application() \
application(blobby.desktop) \
blobby \
blobby(aarch-64) \
metainfo() \
metainfo(blobby.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libphysfs.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
