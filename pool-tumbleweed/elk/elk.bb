SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-8.7.2-1.4.aarch64.rpm"
RPM_HASH = "ddbfd7b7af6615bbd70c553fe1b66552d4b652029e0e093865316ef2da443d0047d366b33992622c2a0cdb9f4e3e712914c1e9cc1715990f655b9ed64602d5cf"

RPROVIDES:${PN} += "elk"

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
libwannier.so \
libxc.so.12 \
wannier90-devel"

inherit rpm
