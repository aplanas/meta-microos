SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi1 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi1-8.7.2-1.4.aarch64.rpm"
RPM_HASH = "1e88cb39f0861331fb22b59ff7ac3ce610991d7cbeb9ee3fa27e7933ec7ea2b8befa5458dcf5d2e73b9ae36fa41a5a2812535715aeedde8aef51c497ef1ef89c"

RPROVIDES:${PN} += "elk-openmpi1"

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
libmpi-mpifh.so.12 \
libmpi-usempif08.so.11 \
libwannier.so \
libxc.so.12 \
openmpi1-libs \
wannier90-openmpi1-devel"

inherit rpm
