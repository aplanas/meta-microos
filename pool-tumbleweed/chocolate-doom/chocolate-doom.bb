SUMMARY = "Conservative DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Chocolate Doom is a Doom source port with focus on accurate \
reproduction of the original DOS version of Doom and other games \
based on the Doom engine. There are no new features, a lack of high \
resolution rendering, and goes as far as to duplicate or recreate \
bugs and crashes found in the DOS executable that were fixed before \
the initial open-sourcing of the Doom engine."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "chocolate-doom-3.0.1-3.2.aarch64.rpm"
RPM_HASH = "e4f80233237ad1253e0e220550c912a06846ddbdb7c5c37a3996f659460576d8849a24e59d49d2a804ac744b3339eb1be22d6274e730e88edfd54d25c3ce8012"

RPROVIDES:${PN} += "chocolate-doom \
chocolate-heretic \
chocolate-hexen \
chocolate-strife"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0"

inherit rpm
