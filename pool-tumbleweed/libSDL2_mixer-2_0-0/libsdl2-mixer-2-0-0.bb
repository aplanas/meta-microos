SUMMARY = "Simple DirectMedia Layer 2 – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "libSDL2_mixer-2_0-0-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "c6328cb5dc219995792474081ee07b7fa94b31443225c1ebe4a9c38f59a3d1373702d84e362fe6abfb8eb24eb64555f2b8d545397de3419a934c1652a455c6b6"

RPROVIDES:${PN} += "SDL2-mixer \
libSDL2-mixer-2-0-0 \
libSDL2-mixer-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libxmp.so.4"

inherit rpm
