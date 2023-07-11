SUMMARY = "Library for Fluidsynth"
DESCRIPTION = "This package contains the shared library for Fluidsynth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.3"

RPM_NAME = "libfluidsynth3-2.3.3-1.1.aarch64.rpm"
RPM_HASH = "cc4ff29cd1aaba8f2fabf104be577ed0cfc046ea81b1a98f2e13f0a147064440fa15ec7b68d6f5dfb72d9a7202a0dc4452b53f4a31d5c171685d0781102921d9"

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
