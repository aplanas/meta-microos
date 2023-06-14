SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi5 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi5-8.7.2-1.3.aarch64.rpm"
RPM_HASH = "0557cf44297119d5b4d173e51f28fe150aef8db74c910649b0746429cd5ae45bf22b659a74f3a1f35ea85231167db54f9ef8f915557f0c00ee9259f03c911f61"

RPROVIDES:${PN} += "elk-openmpi5"

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
libmpi-mpifh.so.80 \
libwannier.so \
libxc.so.12 \
openmpi5-libs \
wannier90-openmpi5-devel"

inherit rpm
