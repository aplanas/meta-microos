SUMMARY = "'alsamixer' for pulseaudio"
DESCRIPTION = "ncurses pulseaudio mixer similar to pavucontrol and alsamixer"
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "pamix-1.6-1.26.aarch64.rpm"
RPM_HASH = "de719b2dad2b00aab57e38a8943e1b32c56bddd6e710240b518b3d9ee9a11cfb155740ae863fb6c5a474d6e5da36a820deb3fe53cd05df56e2c0b13d48bef12c"

RPROVIDES:${PN} += "config-pamix \
pamix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
