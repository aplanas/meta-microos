SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi4 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi4-8.7.2-1.3.aarch64.rpm"
RPM_HASH = "525fd14d9ecb9171978a7035cfe2dff399f6da8b638078b9f700fc4462811786fc54a14ad0407deb9500399408133eecdd38b53ed050b3ea4d2bf8f2c41bfd72"

RPROVIDES:${PN} += "elk-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libwannier.so \
libxc.so.12 \
openmpi4-libs \
wannier90-openmpi4-devel"

inherit rpm
