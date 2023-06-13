SUMMARY = "Devel files for wannier90-openmpi3"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi3-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "005a162b9016f2edf437cb725118e0ceeb6c5af47ae19c213830fbca16aa221c97ba736e68aa78b2890a72b6616c17ab7a4bd363b4710bd181286fc94adbe213"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
wannier90-openmpi3-devel \
wannier90-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi_mpifh.so.40()(64bit)"

inherit rpm
