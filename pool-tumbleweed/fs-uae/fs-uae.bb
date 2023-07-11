SUMMARY = "Amiga emulator with on-screen GUI and online play support"
DESCRIPTION = "FS-UAE is an Amiga emulator based on UAE/WinUAE, with a focus on \
emulating games. \
 \
Features include emulation of Amiga 500, 1200, 4000, CD32 \
and CDTV, perfectly smooth scrolling on 50Hz displays, support \
for floppy images in ADF and IPF formats, CD-ROM images in ISO \
or BIN/CUE format, mounting directories on a machine as Amiga \
hard drives, support for Picasso 96 drivers for high-color and \
high-resolution Workbench displays, and more. \
 \
A unique feature is support for cross-platform online play. \
Amiga games can be played against (or with) other users over \
a network. \
 \
The emulator uses the Amiga emulation code from the \
WinUAE project and requires a moderately fast computer with \
accelerated graphics (OpenGL) to work. A game pad or joystick is \
recommended, but not required (FS-UAE can emulate a joystick \
using the cursor keys and right Ctrl/Alt keys)."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.66"

RPM_NAME = "fs-uae-3.1.66-1.9.aarch64.rpm"
RPM_HASH = "c6317ce580814799aabf576729adf3562b0579b1120509ce63b3891edc4176496b591e3498dc6f50dd2c83740a6539320d749e3af4ee8ef00b4915668467ca3e"

RPROVIDES:${PN} += "fs-uae"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libmpeg2.so.0 \
libmpeg2convert.so.0 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
