SUMMARY = "An Excellent Oxyd Clone"
DESCRIPTION = "Enigma is similar to the well known game Oxyd."
LICENSE = "GPL-2.0-or-later"

PV = "1.30"

RPM_NAME = "enigma-1.30-1.11.aarch64.rpm"
RPM_HASH = "2e0e936c31873b7c5938715ca4907dc5d013d20ad9a7ad7f98a10ee1550d8bab250f9a8c5c1bf0e93a9e12327f2e198fb1f21c3d391fa4ffb0a6bd37d548c5eb"

RPROVIDES:${PN} += "enigma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libz.so.1"

inherit rpm
