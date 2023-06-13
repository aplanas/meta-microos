SUMMARY = "Development files for libass, a subtitle rendering library"
DESCRIPTION = "This package is needed if you want to develop / compile against libass."
LICENSE = "ISC"

PV = "0.17.1"

RPM_NAME = "libass-devel-0.17.1-1.2.aarch64.rpm"
RPM_HASH = "48eb78454dcbe27531b23299c7253623c2e1aee095fa1dfc51acf1e4c9b2413ae002c164f6b42f932eb6f53b57ee3fed5b07690499bb4bee98d71c3956dd8b7e"

RPROVIDES:${PN} += "libass-devel \
libass-devel(aarch-64) \
pkgconfig(libass)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libass9 \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(fribidi) \
pkgconfig(harfbuzz)"

inherit rpm
