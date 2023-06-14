SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi1-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "804c04b314d2e2d71a78de3b284c8fb2d931a649abb4684b0acc64063e50895130c0409ce44ad36cacd246bf5d9a7a09985d2b59b0269cfd8919a7a0febf36c6"

RPROVIDES:${PN} += "wannier90-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12"

inherit rpm
