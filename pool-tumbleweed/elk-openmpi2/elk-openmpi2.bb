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

RPROVIDES:${PN} += "elk-openmpi2"

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
libmpi-mpifh.so.20 \
libwannier.so \
libxc.so.12 \
openmpi2-libs \
wannier90-openmpi2-devel"

inherit rpm
