SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.1.g17"

RPM_NAME = "SDL2_sound-devel-2.0.1.g17-1.9.aarch64.rpm"
RPM_HASH = "2afd656f64f253c7c659a0bec1acd6a694e5e00b18f794f231a583c9002cb6a026fdd2b7b5297e0608cb0084f54a086d210fbbf56885227019e9382aaa43ce8a"

RPROVIDES:${PN} += "SDL2_sound-devel \
SDL2_sound-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) \
libSDL2_sound.so.2()(64bit) \
libSDL2_sound2 \
libc.so.6(GLIBC_2.34)(64bit) \
pkgconfig(sdl2)"

inherit rpm
