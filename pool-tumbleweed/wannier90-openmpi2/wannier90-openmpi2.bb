SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi2-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "0849d6045da7105db08edc48b7da3fc8b3d5c9b20e537c6f76e946bf7578b6d95030271d516f33edc5f2ca01b5aaa222ecf17078dd9381fdc4d9b7e773c0b5d6"

RPROVIDES:${PN} += "wannier90-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20"

inherit rpm
