SUMMARY = "Liberate the universe from the evil company WEAPCO"
DESCRIPTION = "Project: Starfighter is an old school 2D shoot 'em up. In the game you take on \
the role of a rebel pilot called Chris, who is attempting to overthrow a \
military corporation called Weapco. Weapco has seized control of the known \
universe and currently rules it with an iron fist. Chris can no longer stand \
back and watch as millions of people suffer and die. He steals an experimental \
craft known as 'Firefly' and begins his mission to fight his way to Sol, \
freeing key systems along the way. The game opens with Chris attempting to \
escape a Weapco patrol that has intercepted him."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-2.4-1.14.aarch64.rpm"
RPM_HASH = "92d378f4b463758bc93c896b16ae5dd98ea1e846ef41c913f2637cb8b4dfaaf58767cce1f14f1420721688990db85d5e16f0c74f05854ce6f0429461203cc2ea"

RPROVIDES:${PN} += "starfighter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
