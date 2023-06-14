SUMMARY = "PostScript and PDF converter (development files)"
DESCRIPTION = "PostScript and PDF converter development headers and library files."
LICENSE = "GPL-2.0-or-later"

PV = "3.78"

RPM_NAME = "pstoedit-devel-3.78-2.5.aarch64.rpm"
RPM_HASH = "57fc7d2a06ab57b122d275699a669fa7229ed37dc5f4eb3dc623adc0acafb0a4b6c341fa9ce2f28f26dd01bdf3a1430ffd2784af6596aed7026525c2b522b4d0"

RPROVIDES:${PN} += "pkgconfig-pstoedit \
pstoedit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ImageMagick-devel \
libMagick++-devel \
libpng-devel \
libzip-devel \
pstoedit"

inherit rpm
