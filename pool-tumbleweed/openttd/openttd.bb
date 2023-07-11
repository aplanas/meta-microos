SUMMARY = "A clone of Chris Sawyer's Transport Tycoon Deluxe"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
Use package openttd-dedicated for systems without SDL."
LICENSE = "GPL-2.0-only"

PV = "13.3"

RPM_NAME = "openttd-13.3-1.1.aarch64.rpm"
RPM_HASH = "cded6ce4e629ad2b2e54843043b0c31b86a1a0f3795a103efa78d786cf43c5fb5405bd94f4eb37ee9fde7cb891b8a9a622e3a6d341d7e401658940b52ca6e79a"

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
