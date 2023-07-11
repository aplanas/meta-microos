SUMMARY = "Devel files for wannier90"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "0784f5e659d5945de8a91021a29bcbdcda4f9ef80dc6c33341e11f36c184ef17be6920efe2c6ce56dfdf5576b116c33461ac3def226ab7d27989980842836f3e"

RPROVIDES:${PN} += "libwannier.so \
pkgconfig-wannier \
wannier90-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
