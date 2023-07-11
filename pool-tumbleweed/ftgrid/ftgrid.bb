SUMMARY = "Simple glyph grid viewer"
DESCRIPTION = "Simple glyph grid viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgrid-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "020296bf7eefa464fffeabbc83f53ad34127bc58f987c3380508228d47453f944fa78c89d61de48a6d934a3aad88104d3051b39c917a1176be0a8dfd9f497853"

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
