SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "7b3d296fef20eed85d7a589053d00813c0f909a43c90ed28798bc609117ce89450d10ba6649909ff76616319290310f809839b18b6a03c021582439e640c29f0"

RPROVIDES:${PN} += "wannier90 \
wannier90(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit)"

inherit rpm
