SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftview-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "746a0384d83209934b5efa34151c8751fbb1208ecbd18c9f5f9e47b32f560e8cc4d1a51da4a32940687cd7c88c86c7e03f06e499fdd348a6d17c6f3c2e58b7d1"

RPROVIDES:${PN} += "ftview \
ftview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
