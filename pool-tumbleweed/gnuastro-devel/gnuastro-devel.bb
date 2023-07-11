SUMMARY = "Development files for gnuastro"
DESCRIPTION = "Development files required for development with GNU Astronomy \
Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-devel-0.19-1.11.aarch64.rpm"
RPM_HASH = "83b7fb84f70a4306eabec264c6cade2540dd69c13d625c89f35b1afd3fc0f128534c38d93ccdd28c37e3c407a23b55367c84ff5e8b2d5ee412c91182310e3111"

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
