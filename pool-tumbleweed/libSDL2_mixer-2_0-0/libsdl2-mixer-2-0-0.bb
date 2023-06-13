SUMMARY = "Simple DirectMedia Layer 2 – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "libSDL2_mixer-2_0-0-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "0eaff9103ee78a9ed73adee44c5afd9af4a8e58c54437374f427bcfe48c63687f81e8c3e2c0eb832d0c9729bc546b3488f0f4356233df0ea6e2475dd24b6f52a"

RPROVIDES:${PN} += "SDL2_mixer \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_mixer-2_0-0 \
libSDL2_mixer-2_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfluidsynth.so.3()(64bit) \
libxmp.so.4()(64bit)"

inherit rpm
