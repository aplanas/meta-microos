SUMMARY = "Library for Fluidsynth"
DESCRIPTION = "This package contains the shared library for Fluidsynth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "libfluidsynth3-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "f1cce87a6a7ade85a1bf35672605d8986e0cf4fc64ed13d668ce756efc9aa7c3d46bb3e918cf83feb47c2eeed684e010816583ce7cd56b2357ebaafb35541753"

RPROVIDES:${PN} += "libfluidsynth.so.3 \
libfluidsynth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libinstpatch-1.0.so.2 \
libjack.so.0 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libreadline.so.8 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
