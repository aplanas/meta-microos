SUMMARY = "A complete rewrite of the NASM assembler"
DESCRIPTION = "YASM is a complete rewrite of the NASM assembler. It is designed from \
the ground up to allow for multiple syntaxes to be supported (e.g., \
NASM, TASM, GAS, etc.) in addition to multiple output object formats. \
Another primary module of the overall design is an optimizer module. \
Actually it supports ix86 and AMD64, next will be PowerPC"
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-1.3.0-7.3.aarch64.rpm"
RPM_HASH = "9f3b08b0c8c54f638baade2040f7e7cd5b1bd50fd7130d91e8439c2be1d167025079f9f2a8c4027d402fb8d9717acf8078c8fc3ae247f7b3fd1a8a43a8faaf97"

RPROVIDES:${PN} += "yasm \
yasm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
