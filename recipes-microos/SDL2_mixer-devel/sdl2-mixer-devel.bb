SUMMARY = "Development files for the SDL2 sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "SDL2_mixer-devel-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "523c51148eafbc11f8c3735fa39a1eb77d4eb9a6dd93a6a6aadbb1ff4e8bcd80738ca41494c85969e3809803ef4fb25baea3bb2af1b6af5a8ed2bd458a1f7dc9"

RPROVIDES:${PN} += "SDL2_mixer-devel SDL2_mixer-devel(aarch-64) libSDL2_mixer-devel pkgconfig(SDL2_mixer)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSDL2_mixer-2_0-0 pkgconfig(fluidsynth) pkgconfig(libxmp) pkgconfig(sdl2)"

inherit rpm
