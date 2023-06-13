SUMMARY = "Development files for gnuastro"
DESCRIPTION = "Development files required for development with GNU Astronomy \
Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-devel-0.19-1.10.aarch64.rpm"
RPM_HASH = "ea3d6249bb06b8680386cba58904c9246419270c61ac45523b66f8c8f1613a0d2db9b689d53b360fe2347df343c3bac3e2ee974b260732c83f7ddab3da81b255"

RPROVIDES:${PN} += "gnuastro-devel \
gnuastro-devel(aarch-64) \
pkgconfig(gnuastro)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnuastro17 \
pkgconfig(cfitsio) \
pkgconfig(gsl) \
pkgconfig(libgit2) \
pkgconfig(libjpeg) \
pkgconfig(liblzma) \
pkgconfig(libtiff-4) \
pkgconfig(wcslib)"

inherit rpm
