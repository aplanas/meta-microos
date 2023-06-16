SUMMARY = "Higher resolution DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Crispy Doom is a limit-removing enhanced-resolution Doom source port \
based on Chocolate Doom."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "crispy-doom-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "6a5584f15843dfd2d70ab174b05c7afe11aa7c81094f8654122d74bd313c4ce5460ae4528eda07042fe998ba468d2e61fd07ca6fd2b4a14077957a4e4758ebec"

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
