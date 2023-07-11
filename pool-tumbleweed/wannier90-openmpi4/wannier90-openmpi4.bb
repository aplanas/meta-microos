SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi4-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "2852948017b3a2d7b76464d90d2df49a833196a849e9c57f833f81ef73e755a42c4085d33e4bc2b4687f1a1edcc76c61688d2dbcc44de738218c26521136b73f"

RPROVIDES:${PN} += "wannier90-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
