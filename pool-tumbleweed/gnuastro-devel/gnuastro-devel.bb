SUMMARY = "Development files for gnuastro"
DESCRIPTION = "Development files required for development with GNU Astronomy \
Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-devel-0.19-1.12.aarch64.rpm"
RPM_HASH = "24a91391fc2352ffb28c11ed05ed6c54a5c65112957b982357f826070edff25bb721a5e785b8b34e75c8e86e2e8cfa4306b1ed5d294779e59001f05bd18ced95"

RPROVIDES:${PN} += "gnuastro-devel \
pkgconfig-gnuastro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnuastro17 \
pkgconfig-cfitsio \
pkgconfig-gsl \
pkgconfig-libgit2 \
pkgconfig-libjpeg \
pkgconfig-liblzma \
pkgconfig-libtiff-4 \
pkgconfig-wcslib"

inherit rpm
