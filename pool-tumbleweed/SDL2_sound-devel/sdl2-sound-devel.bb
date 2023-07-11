SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.1+g60"

RPM_NAME = "SDL2_sound-devel-2.0.1+g60-1.1.aarch64.rpm"
RPM_HASH = "896c76929d9ed5eb57e7dce310b98db52609bbdf8a600709f4337a754b39c5e970af40cb6524dd461549e151271ed364da81f8ee454497e9fe4ce1d91258f83e"

RPROVIDES:${PN} += "SDL2-sound-devel \
cmake-SDL2-sound \
pkgconfig-SDL2-sound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-sound.so.2 \
libSDL2-sound2 \
libc.so.6 \
pkgconfig-sdl2"

inherit rpm
