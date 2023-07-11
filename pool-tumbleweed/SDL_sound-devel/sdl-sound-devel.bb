SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "SDL_sound-devel-1.0.3-96.7.aarch64.rpm"
RPM_HASH = "785f2649fe5269d2a20757df20c57c2ca2728f3f52acfa75ff2daea16cbd9a1779e0241c5a1453f0618ebc9f2968a596e4f4daaa3ee206200bc8f8628f6245bb"

RPROVIDES:${PN} += "SDL-sound-devel \
libSDL-sound-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-sound-1-0-1 \
libSDL-sound-1.0.so.1 \
libc.so.6 \
pkgconfig-sdl"

inherit rpm
