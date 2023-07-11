SUMMARY = "SDL Input Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL input plugin for the Mupen64plus Nintendo 64 \
Emulator. It has LIRC Infrared remote control interface and Rumble Pak support."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-input-sdl-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "928c62ab7fe61d82d8e3850b1c34241b32a29d3b8d79a5573fd3dbfff2e26b744a56d548fcebccc8b5f90a54bb01c4cd5b5da184bf40aa65e48d5c151ef687d0"

RPROVIDES:${PN} += "mupen64plus-plugin-input \
mupen64plus-plugin-input-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
