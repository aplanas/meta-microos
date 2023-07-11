SUMMARY = "Devel files for wannier90-openmpi5"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "3f0d0292f6248072215d01e7a0a8e07b526b88b75e3ee1450f77f8657263a208195e2104ce5eb6075818e4d09f9a095fabdf6547f217616b6052fdfd21248802"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi5-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.80"

inherit rpm
