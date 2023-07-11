SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.1+g60"

RPM_NAME = "libSDL2_sound2-2.0.1+g60-1.1.aarch64.rpm"
RPM_HASH = "9eeb11475b2509a0164913aea1ac64ff46f671213792103b50d7e9f9e4af483335bcc95eaa7a37aadb3601b8e5b2f8ae7634f4e8aac2d49a4c01b53236c08c3d"

RPROVIDES:${PN} += "libSDL2-sound.so.2 \
libSDL2-sound2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
