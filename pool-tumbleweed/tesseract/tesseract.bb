SUMMARY = "First-person shooter with cooperative in-game map editing"
DESCRIPTION = "Tesseract is a first-person shooter game focused on instagib deathmatch \
and capture-the-flag gameplay as well as cooperative in-game map editing. \
 \
Tesseract is based on Cube2/Sauerbraten. New rendering features include fully \
dynamic omnidirectional shadows, global illumination, HDR lighting, deferred \
shading and morphological/temporal/multisample anti-aliasing."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-2018_02_01-3.12.aarch64.rpm"
RPM_HASH = "2e6aff1135b6bdf0f03da437c3e379cba1bdb2272b3e597dccb59d12df12fc912caa3b772b1558d8fcf723cfb8aa8a9da8728575a03850e175677c1b109b0bbe"

RPROVIDES:${PN} += "tesseract"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
tesseract-data"

inherit rpm
