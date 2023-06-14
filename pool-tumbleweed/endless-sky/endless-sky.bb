SUMMARY = "Space exploration, trading, and combat game"
DESCRIPTION = "Explore other star systems. Earn money by trading, carrying passengers, \
or completing missions. Use your earnings to buy a better ship or to \
upgrade the weapons and engines on your current one. Blow up pirates. \
Take sides in a civil war. Or leave human space behind and hope to \
find some friendly aliens whose culture is more civilized than your own..."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-only"

PV = "0.9.16.1"

RPM_NAME = "endless-sky-0.9.16.1-1.1.aarch64.rpm"
RPM_HASH = "d1796703c6f81aedd302da6e71474f756d6db5f40d5c60899aee582e18972800d849769b58f78f8c0f2508c385ffbe1a5c477ed267771e9d4c5ef9328bbffdb5"

RPROVIDES:${PN} += "endless-sky"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
