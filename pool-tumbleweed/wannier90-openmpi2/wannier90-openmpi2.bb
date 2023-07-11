SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi2-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "cd1f26ec1b13ff082ff04adf0d675a18ca71b5b45a9561bc1c5ebce90c0c0b9af21bc2f5f6e92231470648f5fd401dfd05ea5843d5cdf956d3614094914c836c"

RPROVIDES:${PN} += "wannier90-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20"

inherit rpm
