SUMMARY = "A clone of Chris Sawyer's Transport Tycoon Deluxe"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
Use package openttd-dedicated for systems without SDL."
LICENSE = "GPL-2.0-only"

PV = "13.4"

RPM_NAME = "openttd-13.4-1.1.aarch64.rpm"
RPM_HASH = "9e24599b82bb673b328e841c1ded54c64d633164006fd5d7aa13686cf629afa6dda6f122e4cb617a09b401ae02e1285f09f832415e6ca7ad7556a0b649c5cc1a"

RPROVIDES:${PN} += "openttd \
openttd-gui"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
openttd-data"

inherit rpm
