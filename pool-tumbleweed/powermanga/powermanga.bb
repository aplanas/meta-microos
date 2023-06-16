SUMMARY = "Arcade 2D shoot-them-up game"
DESCRIPTION = "In this 'shoot 'em up' with 3d graphics, you'll have to face \
and destroy more than 60 different types of opponents. \
Nice musics, many weapons, and a ton of surprises."
LICENSE = "GPL-3.0-or-later"

PV = "0.93.1"

RPM_NAME = "powermanga-0.93.1-5.3.aarch64.rpm"
RPM_HASH = "a1d80ec8488b86ec065ea9bfa9b69cab263224b55af59e57d6be8f698aa8b90e1d20965ad1dc70208b329d009b78bb35222e380034f7d058bc6ec46edbb92026"

RPROVIDES:${PN} += "config-powermanga \
powermanga"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
