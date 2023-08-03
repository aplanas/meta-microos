SUMMARY = "OpenTTD Dedicated Server binary (without SDL)"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the binary openttd-dedicated without dependency of SDL."
LICENSE = "GPL-2.0-only"

PV = "13.4"

RPM_NAME = "openttd-dedicated-13.4-1.1.aarch64.rpm"
RPM_HASH = "4d0a12d61a6a0ae21a5a70368a1775461d05833479377531671d7b66f69032c8ea3f57a2db680d3ab1e7af13fb94c179b44247901fe88dab66f3b21021e7c3dd"

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
