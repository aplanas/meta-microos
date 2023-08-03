SUMMARY = "InfiniBand fabric simulator for management"
DESCRIPTION = "ibsim provides simulation of infiniband fabric for using with OFA \
OpenSM, diagnostic and management tools."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.12"

RPM_NAME = "ibsim-0.12-1.1.aarch64.rpm"
RPM_HASH = "514b9ec122abf5d8a131e44cb48ae26d924c80afaea2a5ee4b7da9d20bd9d0a1d7d02522930fd976322773a9089cba4572ac525e6365c87703070f40f2275fd4"

RPROVIDES:${PN} += "ibsim \
libumad2sim.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
