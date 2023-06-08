SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftview-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "529bc8a4a93939d71722756325b3a757ca31eaa73076733c4dfcd36c9bede86c95fd0eb43c73490e6cfedc3aa105b4749b93f508a092e2adf17dfcc959a07af1"

RPROVIDES:${PN} += "ftview ftview(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libgobject-2.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
