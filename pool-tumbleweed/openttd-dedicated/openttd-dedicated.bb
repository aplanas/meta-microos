SUMMARY = "OpenTTD Dedicated Server binary (without SDL)"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the binary openttd-dedicated without dependency of SDL."
LICENSE = "GPL-2.0-only"

PV = "13.3"

RPM_NAME = "openttd-dedicated-13.3-1.1.aarch64.rpm"
RPM_HASH = "f90d27b86cbb58fcfcadb7baa00b5d4d7aa47fb115b3a755c18f98b978ba5cf3a8bd37752857a30f506b35272232876dc73b1cc8b45610bfc1431154a8006dd9"

RPROVIDES:${PN} += "openttd-dedicated"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
openttd-data"

inherit rpm
