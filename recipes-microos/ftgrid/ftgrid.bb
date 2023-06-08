SUMMARY = "Simple glyph grid viewer"
DESCRIPTION = "Simple glyph grid viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgrid-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "831c158c484556a99c5e3a1f1a552318c6c1da4ddee034c88a00cef4d6b6e1556416dd20771c4e9ce9b0a04f3b9176e00fbc9115ba6a93b191c4571fa1e95996"

RPROVIDES:${PN} += "ftgrid ftgrid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libgobject-2.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
