SUMMARY = "A software to remove unnecessary data from SVG files"
DESCRIPTION = "Svgcleaner reduces the size of an SVG image by removing useless data such as \
- temporary data used by the vector editing application \
- non-optimal SVG structure representation \
- unused and invisible graphical elements"
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-0.9.5-2.25.aarch64.rpm"
RPM_HASH = "76a5ac348222feb7dfd5d9ba04f5e324fccc0bde8398f92b71d7c584496b2311e2398414ad8c83b31a5e2c38715f7e3299aaf0ce83f32d59ddeb70d092626c9d"

RPROVIDES:${PN} += "svgcleaner \
svgcleaner(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
p7zip \
svgcleaner-gui"

inherit rpm
