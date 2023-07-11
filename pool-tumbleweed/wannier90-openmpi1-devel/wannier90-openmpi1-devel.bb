SUMMARY = "Devel files for wannier90-openmpi1"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi1-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "e8189c4b74837a93912816796bc5269ab633aff4b61e01032bedf80f1064ed61a562e3fb9b87f19d7b9d23671201bc56edd01230f6fbfbd3f9df0f19cac946c8"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi1-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12"

inherit rpm
