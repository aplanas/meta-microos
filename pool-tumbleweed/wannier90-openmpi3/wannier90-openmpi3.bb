SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi3-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "9bed337b2ef7bd309653cbff50ff9601c0581570469c784990838b94bf2ad0d5076493c6702b15244ed6d6d05da08f092220aae91edbac1254a677f08ed97818"

RPROVIDES:${PN} += "wannier90-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
