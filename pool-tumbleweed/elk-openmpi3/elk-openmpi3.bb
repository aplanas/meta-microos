SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi3 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi3-8.7.2-1.3.aarch64.rpm"
RPM_HASH = "2e4e5b0031681e0a2eebd3fb7fbc39119f0851baeeb3a726508c35e49ffb55bbedaf2ff9ae09e24cf1fbc15758285a626f6cd6b71850f6cf1b2962b951379d80"

RPROVIDES:${PN} += "elk-openmpi3"

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
openmpi3-libs \
wannier90-openmpi3-devel"

inherit rpm
