SUMMARY = "Arcade 2D shoot-them-up game"
DESCRIPTION = "In this 'shoot 'em up' with 3d graphics, you'll have to face \
and destroy more than 60 different types of opponents. \
Nice musics, many weapons, and a ton of surprises."
LICENSE = "GPL-3.0-or-later"

PV = "0.93.1"

RPM_NAME = "powermanga-0.93.1-5.3.aarch64.rpm"
RPM_HASH = "a1d80ec8488b86ec065ea9bfa9b69cab263224b55af59e57d6be8f698aa8b90e1d20965ad1dc70208b329d009b78bb35222e380034f7d058bc6ec46edbb92026"

RPROVIDES:${PN} += "application() \
application(powermanga.desktop) \
config(powermanga) \
powermanga \
powermanga(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
