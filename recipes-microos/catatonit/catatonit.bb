SUMMARY = "A signal-forwarding process manager for containers"
DESCRIPTION = "Catatonit is a /sbin/init program for use within containers. It \
forwards (almost) all signals to the spawned child, tears down \
the container when the spawned child exits, and otherwise \
cleans up other exited processes (zombies). \
 \
This is a reimplementation of other container init programs (such as \
'tini' or 'dumb-init'), but uses modern Linux facilities (such as \
signalfd(2)) and has no additional features."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.7"

RPM_NAME = "catatonit-0.1.7-1.7.aarch64.rpm"
RPM_HASH = "883da28cfd6a80cb2f070fd519def4228f6f0cb72fcf2577d59782ea57aec3fdd8028c3d75f7b0921dfe5d4c7250715051df65195097ea3e1b9488cb0f4e2994"

RPROVIDES:${PN} += "catatonit catatonit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
