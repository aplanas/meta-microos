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

RPM_NAME = "fs-uae-3.1.66-1.8.aarch64.rpm"
RPM_HASH = "8509feeea3e9b260dd9d44faebd4f3bf3fc2e954fb697c83fb59ede5d04e91fb327f377fd4bcfb9b26c7f89a9e9c49e920cb964eb42fbda03bf581ec3bcdebae"

RPROVIDES:${PN} += "application() \
application(fs-uae.desktop) \
fs-uae \
fs-uae(aarch-64) \
mimehandler(application/x-adf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpeg2.so.0()(64bit) \
libmpeg2convert.so.0()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
