SUMMARY = "Helper library allowing to equip any game with GameMode support"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemodeauto allows you to use GameMode with any Game by \
preloading it into the game. \
 \
    LD_PRELOAD=/usr/lib64/libgamemodeauto.so.0 ./game \
 \
For Steam games this can be done by editing the launch options: \
 \
    LD_PRELOAD=$LD_PRELOAD:/usr/lib64/libgamemodeauto.so.0 %command% \
 \
Nowadays this however can be easier done by using the gamemoderun command \
from the gamemode package."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemodeauto0-1.7-3.1.aarch64.rpm"
RPM_HASH = "a18bd73d30dcb5421fb02f67918222b810ad100fc0d11ea02d17764da8099cf458d7274900595261dee1683ec0f9ac067783c6acc1c8d2ee026a1cce94515dae"

RPROVIDES:${PN} += "libgamemodeauto.so.0 \
libgamemodeauto0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgamemode0"

inherit rpm
