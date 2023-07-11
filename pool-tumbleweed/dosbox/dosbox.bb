SUMMARY = "DOS/x86 emulator to run old DOS games"
DESCRIPTION = "dosbox-staging is DOS/x86 emulator focusing on ease of use. \
Based on DOSBox, it is a fork which use modern library (e.g.: sdl2) and \
practice in an attempt to revitalize the development process. \
DOSBox Staging is an attempt to revitalize DOSBox's development process. \
It's not a rewrite, but a continuation and improvement on the existing \
DOSBox codebase while leveraging modern development tools and practices. \
Added support: Opus, FLAC, MT32, GM, GUS, Raw mouse input and more. \
https://github.com/dosbox-staging/dosbox-staging#readme"
LICENSE = "GPL-2.0-or-later"

PV = "0.80.1"

RPM_NAME = "dosbox-0.80.1-1.5.aarch64.rpm"
RPM_HASH = "3b8df8b3c3196ba5a69200962dea309b3c719263e9a3cb221992bdb27ab9957f8b2c94c5192548f0039e0978856ebe58f52cae949a3ee6613771d978713811b0"

RPROVIDES:${PN} += "dosbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libiir.so.1 \
libm.so.6 \
libmt32emu.so.2 \
libopusfile.so.0 \
libpng16.so.16 \
libslirp.so.0 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
