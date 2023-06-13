SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi4-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "095920c68f9c1e39109ce7b18e096a089b1d4754d46e955f5dfa529385ae75801b236d39a4f9aad112327a7b736a58de538403ffc9036c2444aeffe5024cdd87"

RPROVIDES:${PN} += "wannier90-openmpi4 \
wannier90-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi_mpifh.so.40()(64bit)"

inherit rpm
