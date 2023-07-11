SUMMARY = "A racing game in the style of 'Stunts'"
DESCRIPTION = "Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-0.7.7.1-2.4.aarch64.rpm"
RPM_HASH = "4d95c2b2fc004a7ea38bde532479354473efd4f821ee70d319943f3010c21963e25ceabcaf8e1cf5e8a672d5c8a1e2624573a002328461900d11cbae6aa848fc"

RPROVIDES:${PN} += "config-ultimatestunts \
ultimatestunts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
ultimatestunts-data"

inherit rpm
