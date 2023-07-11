SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libSDL_sound-1_0-1-1.0.3-96.7.aarch64.rpm"
RPM_HASH = "20cd6fe2e43eba869590c45e8ee1382278301a3990a7beecbeb73d5d58ed6acf6499d6a96c16eb3c908a00453050edc00e0ec916800c99f24ac7cb6d35203c54"

RPROVIDES:${PN} += "SDL-sound \
libSDL-sound-1-0-1 \
libSDL-sound-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL-1.2.so.0 \
libc.so.6 \
libmikmod.so.3 \
libmodplug.so.1 \
libogg.so.0 \
libspeex.so.1 \
libvorbisfile.so.3"

inherit rpm
