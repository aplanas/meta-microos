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

RPM_NAME = "dsda-doom-0.24.3-1.10.aarch64.rpm"
RPM_HASH = "b174953a6ed421b1995f4e13248b8ce6419599acfd1e819fd040c449be84f170aaf694edaf6a8668efd30a4e740491a775dd41444c75f0e55362e2e9a0e6bcf1"

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
