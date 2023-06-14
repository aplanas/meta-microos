SUMMARY = "SDL Audio Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL audio plugin for the Mupen64plus Nintendo 64 \
Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-audio-sdl-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "1955b684b29edc3ac9939dc05c8fa469e44fd450e453facd4cb1e86bc04b23f6c072dce780629e1b6ed5356f6c3b17abf9c49e3a2e774d2f9963610eb18a214c"

RPROVIDES:${PN} += "mupen64plus-plugin-audio \
mupen64plus-plugin-audio-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libsamplerate.so.0"

inherit rpm
