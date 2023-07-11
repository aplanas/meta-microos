SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "d20fb3078fab22125e86997efc103eca8caef1d01ed80b3c31380e316cd61874174a2050a5e8ebef7d5927acd8b91eedc19e4e2349dc0ccc197d05d0889dd9d2"

RPROVIDES:${PN} += "wannier90-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.80"

inherit rpm
