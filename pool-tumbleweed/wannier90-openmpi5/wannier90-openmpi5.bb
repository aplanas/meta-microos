SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-3.1.0-2.5.aarch64.rpm"
RPM_HASH = "b0796e71ff203ba15e7555b46b65e08c78f51c9efa7390e19918f8eb3b1a17de6c79b5cc0cd89e60ced3b8e7883dfd5d022279f4a103d7cad1c225fe4b0423e9"

RPROVIDES:${PN} += "wannier90-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
