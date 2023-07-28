SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftview-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "526779372ca1831375e29f265688f07f65858965d2d522819e5fad75e87f0ea0bd0e553941d4a49b5b54fb7e9eb1db8a6721bf0b58a669b0ecd9d6cfe189c477"

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
