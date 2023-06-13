SUMMARY = "SDL Input Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL input plugin for the Mupen64plus Nintendo 64 \
Emulator. It has LIRC Infrared remote control interface and Rumble Pak support."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-input-sdl-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "6a71a37e9c79cc739bc7b0a2df6e909af69cf78540339df5426aeaa819651ed967b9870edeecad066aeeb92a9ebfe7a66805566d28df061b0335ccee89077a21"

RPROVIDES:${PN} += "mupen64plus-plugin-input \
mupen64plus-plugin-input-sdl \
mupen64plus-plugin-input-sdl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
