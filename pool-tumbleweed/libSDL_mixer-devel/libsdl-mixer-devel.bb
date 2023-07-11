SUMMARY = "Development files for the SDL sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "libSDL_mixer-devel-1.2.12-8.30.aarch64.rpm"
RPM_HASH = "e9022e8ad13b33549f39dfd9076874b669ab4678cc3d536ce74a3f369a2382a0d86a648dc2b70fef841951c7f662cf6908bff1869beb7fa9975afa7142780dbe"

RPROVIDES:${PN} += "SDL-mixer-devel \
libSDL-mixer-devel \
pkgconfig-SDL-mixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1-2-0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
pkgconfig-sdl"

inherit rpm
