SUMMARY = "An Excellent Oxyd Clone"
DESCRIPTION = "Enigma is similar to the well known game Oxyd."
LICENSE = "GPL-2.0-or-later"

PV = "1.30"

RPM_NAME = "enigma-1.30-1.10.aarch64.rpm"
RPM_HASH = "2693f09279d5fd64ac70dd71257ca99019c352a1c1a8087f9119789b211dbb4e2c8af108dc4a4b1cdf0fb2b0e71c57e0d4902783a7893d34682a7c6753a89284"

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
