SUMMARY = "Fish Fillets - Next Generation"
DESCRIPTION = "Fish Fillets is strictly a puzzle game. The goal in each of the 70 \
levels is always the same: find a safe way out. The fish utter witty \
remarks about their surroundings and the various inhabitants of their \
underwater realm quarrel among themselves or comment on the efforts of \
your fish. The whole game is accompanied by quiet, comforting music."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "fillets-ng-1.0.1-4.19.aarch64.rpm"
RPM_HASH = "e381a238b9d217a067b76107c55558404842769b1f3d51cbad5d16d2efaad3b305ae577719d6ee22c799e3fe1fa6b55aa68ca65b3aae4e9083f90884ddd8a83b"

RPROVIDES:${PN} += "fillets-ng"

RDEPENDS:${PN} += "fillets-ng-data \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
