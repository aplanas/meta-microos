SUMMARY = "Jump'n run game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a similar \
style like the original SuperMario games."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later & GPL-2.0-or-later & GPL-1.0-only"

PV = "0.6.3"

RPM_NAME = "supertux2-0.6.3-2.10.aarch64.rpm"
RPM_HASH = "de43d1f253815184be963af383c10f2bff008b40e217312a1573f03b8fa0f4c6d03b2b7acc6eadcc8bc81398707b37e041605e45cba5470f354348ae76e7948f"

RPROVIDES:${PN} += "supertux2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libphysfs.so.1 \
libpng16.so.16 \
libraqm.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
