SUMMARY = "OpenTTD Dedicated Server binary (without SDL)"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the binary openttd-dedicated without dependency of SDL."
LICENSE = "GPL-2.0-only"

PV = "13.1"

RPM_NAME = "openttd-dedicated-13.1-1.2.aarch64.rpm"
RPM_HASH = "16fdc2d0dfbca34c30ee184b9ebae4c571426f6dac22f98f5473bdf4f35785c16df8547a063e70a28b64603e22a379bd713cb993b2fb2df6bc0fe39a96ef1764"

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
