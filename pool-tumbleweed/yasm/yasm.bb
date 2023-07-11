SUMMARY = "A complete rewrite of the NASM assembler"
DESCRIPTION = "YASM is a complete rewrite of the NASM assembler. It is designed from \
the ground up to allow for multiple syntaxes to be supported (e.g., \
NASM, TASM, GAS, etc.) in addition to multiple output object formats. \
Another primary module of the overall design is an optimizer module. \
Actually it supports ix86 and AMD64, next will be PowerPC"
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-1.3.0-7.4.aarch64.rpm"
RPM_HASH = "c201e8d77bac8a51206916ddfb75aa5628a0c705d15127b0f7246f833eb80ba3abd86865bc21364db44cabf38f79c5a0b6a8b6542f30f0eade3ffc1ea035ae13"

RPROVIDES:${PN} += "yasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
