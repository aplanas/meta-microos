SUMMARY = "DOOM source port with Hexen support and demo compatibility"
DESCRIPTION = "DSDA-Doom is a source port derived from the PrBoom history line. \
It features: \
 \
* Extra tooling for demo recording, with focus on speedrunning: \
  record-rewind support \
* Heretic and Hexen support \
* MBFv21, UMAPINFO and DSDHacked specification support"
LICENSE = "GPL-2.0-or-later"

PV = "0.24.3"

RPM_NAME = "dsda-doom-0.24.3-1.11.aarch64.rpm"
RPM_HASH = "cf9a7be283113820b33b8d0ed9d40f6ca875c606925d5828947629d5c35f8fb3f48f41e9221a3393fbf464a012ce85c08500c9d53b48290c624eadd467a59744"

RPROVIDES:${PN} += "dsda-doom \
prboom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcreposix.so.0 \
libportmidi.so.2 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
