SUMMARY = "Space exploration, trading, and combat game"
DESCRIPTION = "Explore other star systems. Earn money by trading, carrying passengers, \
or completing missions. Use your earnings to buy a better ship or to \
upgrade the weapons and engines on your current one. Blow up pirates. \
Take sides in a civil war. Or leave human space behind and hope to \
find some friendly aliens whose culture is more civilized than your own..."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-only"

PV = "0.9.16.1"

RPM_NAME = "endless-sky-0.9.16.1-1.2.aarch64.rpm"
RPM_HASH = "51924d5e19e84aaf7738a20677219c3df5b2c6133e94a889ced6ff0bbfc8941ddb0f99f964152d35dee7e743fb42bca239d658d2577fc9eca3b11f8aff6451a2"

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
