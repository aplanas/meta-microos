SUMMARY = "Simple DirectMedia Layer – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "libSDL_mixer-1_2-0-1.2.12-8.29.aarch64.rpm"
RPM_HASH = "a2d4f61c5b4ce01a8d7b52c14c9854273d30bc851eebefe9a5c142cf38e7b26ca5365f50e8b71de8c6d76fb48dc08acb0e383a5b9e014d08b77196243b2794e4"

RPROVIDES:${PN} += "SDL_mixer \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_mixer-1_2-0 \
libSDL_mixer-1_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmikmod.so.3()(64bit) \
libmodplug.so.1()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
