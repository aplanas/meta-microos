SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "7a2f174203e9cbaea525d907b4aebb36e3089adea8b7caced524daff23dae237aa119f86700ef7312e3586166261618de35fb456b23a9c210c8372ce6bd1c71a"

RPROVIDES:${PN} += "wannier90-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.80"

inherit rpm
