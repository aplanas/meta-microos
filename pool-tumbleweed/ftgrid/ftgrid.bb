SUMMARY = "Simple glyph grid viewer"
DESCRIPTION = "Simple glyph grid viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgrid-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "f85c0a3a176bb48c30350c338350d0bcbc3d951c00abb4c89453fc70b17d940c5c60745172971786fe55c70ab03c3d7e9dea3652211051f462dab9b535dc86c5"

RPROVIDES:${PN} += "ftgrid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm
