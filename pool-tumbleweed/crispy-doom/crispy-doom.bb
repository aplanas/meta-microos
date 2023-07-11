SUMMARY = "Higher resolution DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Crispy Doom is a limit-removing enhanced-resolution Doom source port \
based on Chocolate Doom."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "crispy-doom-5.12.0-1.2.aarch64.rpm"
RPM_HASH = "70d7af5152a7c09a96862bcdbb59a9a9d957f19985fb72cb6be3d04044e7d958dcd7f1353bbf47f07b205ca172a06f2e031629f271e280ae8a381e8a6df4141a"

RPROVIDES:${PN} += "crispy-doom \
crispy-heretic \
crispy-hexen \
crispy-strife"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0 \
libz.so.1"

inherit rpm
