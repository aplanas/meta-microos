SUMMARY = "Development files for the SDL sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "libSDL_mixer-devel-1.2.12-8.29.aarch64.rpm"
RPM_HASH = "747eddd0b0e45ca6bb0ba6d421c92ad7de5643803777191ae58f4ac3e58c44e28bfc66fec0536aada72d5c2b8a66a076785565ad4155cb87638d59fbc8bcd1e2"

RPROVIDES:${PN} += "SDL_mixer-devel \
libSDL_mixer-devel \
libSDL_mixer-devel(aarch-64) \
pkgconfig(SDL_mixer)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_mixer-1_2-0 \
libc.so.6()(64bit) \
pkgconfig(sdl)"

inherit rpm
