SUMMARY = "SDL Audio Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL audio plugin for the Mupen64plus Nintendo 64 \
Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-audio-sdl-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "bf827d4c415a2bad3f3a0d6499e0018586b91a3a4f3671982c1a6733530f42841a3d9aa0f71afc691295339609b1f16e7397432b41fe565f9c1d7d70b7d3e585"

RPROVIDES:${PN} += "mupen64plus-plugin-audio \
mupen64plus-plugin-audio-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libsamplerate.so.0"

inherit rpm
