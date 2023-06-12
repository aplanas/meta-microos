SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi2 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi2-8.7.2-1.3.aarch64.rpm"
RPM_HASH = "30b6ba58151abf329bbbac26adec89e89af7056357c9b5ee7d2ad345f27b4122bc2fc00cc637956d794cc698953edab71302a23071a29691faf47c40b97ab99a"

RPROVIDES:${PN} += "elk-openmpi2 \
elk-openmpi2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.20()(64bit) \
libwannier.so()(64bit) \
libxc.so.12()(64bit) \
openmpi2-libs \
wannier90-openmpi2-devel"

inherit rpm
