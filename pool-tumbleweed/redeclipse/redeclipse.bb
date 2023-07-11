SUMMARY = "Fast-paced first person ego shooter"
DESCRIPTION = "Red Eclipse 2 is a first-person shooter based on the tesseract engine. \
Parkour gameplay, different game modes, and several mutators to make the game very flexible. \
A map editor is included."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-2.0.0-4.6.aarch64.rpm"
RPM_HASH = "171e3ab2be88065a679f014b8b420eef7f4682f0934b09475554e144e44688b1a65fd5017483d645e5f19d6d07a34c2520ee3c9b143e2de05180eed17e87b9d8"

RPROVIDES:${PN} += "redeclipse"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libenet.so.7 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
redeclipse-data"

inherit rpm
