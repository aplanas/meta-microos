SUMMARY = "Daemon/library combo for changing Linux system performance on demand"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
GameMode was designed primarily as a stop-gap solution to problems \
with the Intel and AMD CPU powersave or ondemand governors, but is \
now able to launch custom user defined plugins, and is intended to be \
expanded further, as there are a wealth of automation tasks one might \
want to apply. \
 \
For applications that don't implement the GameMode activation themselves, \
you can toggle the GameMode by running them via the gamemoderun command. \
 \
    gamemoderun ./game \
 \
For Steam games this can be done by editing the launch options: \
 \
    gamemoderun %command%"
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "gamemode-1.7-3.1.aarch64.rpm"
RPM_HASH = "230df9c5776531ec074732d00b3d4bc5fbcb186d5fcf73deffa4c6d3b64de971734a745e2f4071471ff7aa30c73953d381d1c14af8fe6dfa6c794a621dd2dc4b"

RPROVIDES:${PN} += "gamemode \
gamemode(aarch-64) \
gamemoded:/usr/bin/gamemodelist \
gamemoded:/usr/bin/gamemoderun"

RDEPENDS:${PN} += "/bin/bash \
libgamemodeauto0"

inherit rpm
