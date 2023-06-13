SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.1.g17"

RPM_NAME = "libSDL2_sound2-2.0.1.g17-1.9.aarch64.rpm"
RPM_HASH = "ea8253b50c84ae290c3ff74dd446f515722fcb535b7d5d4915f7e03a834a51c725652597070de73fb3f9acfd91be4758a02f52a99bbd3b3d13f841e3d1bb171c"

RPROVIDES:${PN} += "libSDL2_sound.so.2()(64bit) \
libSDL2_sound2 \
libSDL2_sound2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit)"

inherit rpm
