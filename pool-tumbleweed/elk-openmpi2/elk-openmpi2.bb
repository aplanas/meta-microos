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

RPM_NAME = "elk-openmpi2-8.7.2-1.4.aarch64.rpm"
RPM_HASH = "7e56bfcb49c40c7629f4b01b62a4e211e560ab3ae071aba65ceaeda8ff56db10e64b26f68521c84505af658e5676a73883d4b0430781967dac9b6689b35057ea"

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
