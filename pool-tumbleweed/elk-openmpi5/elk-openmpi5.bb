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

RPM_NAME = "elk-openmpi5-8.7.2-1.4.aarch64.rpm"
RPM_HASH = "a00438eb395f147fda44ab2d56e1813c7dec41a4d674d3e003b1a1b7847b09ad37e74fd67f896a3f228018039bdf786e5b215f3629c7520515eefe57fe14524a"

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
