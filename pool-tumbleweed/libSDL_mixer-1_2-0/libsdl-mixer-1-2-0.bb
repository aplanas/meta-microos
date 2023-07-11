SUMMARY = "Simple DirectMedia Layer – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "libSDL_mixer-1_2-0-1.2.12-8.30.aarch64.rpm"
RPM_HASH = "3fc507f9373ffb5f720c724a247487db6e5d1085510967621ee3bd0d13c35b6e529cfcaed2cc6bb2eee974881759b2ec9f5968012b3c0a10b1a52b2fd5d24695"

RPROVIDES:${PN} += "SDL-mixer \
libSDL-mixer-1-2-0 \
libSDL-mixer-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libmikmod.so.3 \
libmodplug.so.1 \
libvorbisfile.so.3"

inherit rpm
