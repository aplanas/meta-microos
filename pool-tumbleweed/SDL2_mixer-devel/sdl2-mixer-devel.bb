SUMMARY = "Development files for the SDL2 sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "SDL2_mixer-devel-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "a64d904c0ba4165be29a34853caf8079b2776cb5c76ee996650a8b129d2f4a4a012aff0445eae3231839a9d56c650c3fb6d10884737beebcd783d19d405cf010"

RPROVIDES:${PN} += "SDL2-mixer-devel \
libSDL2-mixer-devel \
pkgconfig-SDL2-mixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-mixer-2-0-0 \
pkgconfig-fluidsynth \
pkgconfig-libxmp \
pkgconfig-sdl2"

inherit rpm
