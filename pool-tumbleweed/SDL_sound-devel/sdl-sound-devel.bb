SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "SDL_sound-devel-1.0.3-96.6.aarch64.rpm"
RPM_HASH = "543daeabc3d5904054bd5cd796d5c6b37282e937ba76361b0ae13d46cb1fa518aa78d57585577a61e712c59f141ff6cecc6c81437523d299bd549a8761fbe50c"

RPROVIDES:${PN} += "SDL-sound-devel \
libSDL-sound-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-sound-1-0-1 \
libSDL-sound-1.0.so.1 \
libc.so.6 \
pkgconfig-sdl"

inherit rpm
