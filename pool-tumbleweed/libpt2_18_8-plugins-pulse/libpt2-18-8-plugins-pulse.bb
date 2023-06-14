SUMMARY = "Pulseaudio support for ptlib"
DESCRIPTION = "This plugin enables pulseaudio support for ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-pulse-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "9a14fbe2195eeb17d93a356ea29c000c8cdff27e784f38ce35c59e07de19efc5a1ab7fd8ea2bd0bb9eb108669677d8d4875ac5849c5509630a5509bdd4274f98"

RPROVIDES:${PN} += "libpt2-18-8-plugins-pulse \
libpt2-audio-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpt.so.2.18.8 \
libpt2-18-8 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
