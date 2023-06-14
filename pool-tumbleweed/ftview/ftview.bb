SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftview-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "746a0384d83209934b5efa34151c8751fbb1208ecbd18c9f5f9e47b32f560e8cc4d1a51da4a32940687cd7c88c86c7e03f06e499fdd348a6d17c6f3c2e58b7d1"

RPROVIDES:${PN} += "ftview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm
