SUMMARY = "Development files for gnuastro"
DESCRIPTION = "Development files required for development with GNU Astronomy \
Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "gnuastro-devel-0.20-1.1.aarch64.rpm"
RPM_HASH = "c70b76081b15d8afd858fbff30a0a37acf08e56578e1ca28a04c6d94d8195fc843107436c34d6818b1b2d994801f7760d24098fb11e01691a933cb6aac838a08"

RPROVIDES:${PN} += "gnuastro-devel \
pkgconfig-gnuastro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnuastro18 \
pkgconfig-cfitsio \
pkgconfig-gsl \
pkgconfig-libgit2 \
pkgconfig-libjpeg \
pkgconfig-liblzma \
pkgconfig-libtiff-4 \
pkgconfig-wcslib"

inherit rpm
