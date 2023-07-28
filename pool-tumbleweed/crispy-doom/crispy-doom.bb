SUMMARY = "Higher resolution DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Crispy Doom is a limit-removing enhanced-resolution Doom source port \
based on Chocolate Doom."
LICENSE = "GPL-2.0-or-later"

PV = "6.0"

RPM_NAME = "crispy-doom-6.0-1.1.aarch64.rpm"
RPM_HASH = "56281b23074af14a17b4039fcd19d569dc03ac20668d672e17818429bd44f4f05298a20224ddb0642f27e7356eacdd43e638b0037958493c51dee866bfd9679c"

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
libfluidsynth.so.3 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0 \
libz.so.1"

inherit rpm
