SUMMARY = "Command Line Frontend for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. \
 \
This package contains a command line frontend."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-ui-console-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "8d64eebfc675a720c53d96637c45571f1ebef7b8aeb4ec3f83d77ab513881b05cbb6c77115656966a2dda7a6c82304c3cc2a42431dc2a0995eafa767d137eb1f"

RPROVIDES:${PN} += "mupen64plus-ui-console"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libmupen64plus2 \
mupen64plus-plugin-audio \
mupen64plus-plugin-input \
mupen64plus-plugin-rsp \
mupen64plus-plugin-video"

inherit rpm
