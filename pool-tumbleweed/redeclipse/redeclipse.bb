SUMMARY = "Fast-paced first person ego shooter"
DESCRIPTION = "Red Eclipse 2 is a first-person shooter based on the tesseract engine. \
Parkour gameplay, different game modes, and several mutators to make the game very flexible. \
A map editor is included."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-2.0.0-4.5.aarch64.rpm"
RPM_HASH = "71819342e592235e6d86b6ad2cbfd40a9da8d0cab21c4368aadc05fb15ec16a4a0afb6b4df36ce46a8a9f1635b5a56809d94081b1f41ba8812cd7dfe7685c063"

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
