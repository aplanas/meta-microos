SUMMARY = "Simple glyph grid viewer"
DESCRIPTION = "Simple glyph grid viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftgrid-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "4b45c4a2d75cf266021ca8218d37b33bb4b4ff5f4220b9fe5a5740a91d85f6c060db33c113f07388bd0a237b4d2044e2f17032f178a8018994d5b7ba7a7c3064"

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
