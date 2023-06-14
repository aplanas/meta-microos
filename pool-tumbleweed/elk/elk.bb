SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-8.7.2-1.3.aarch64.rpm"
RPM_HASH = "d0feb7648d7153c73b382f13f5d72ae4806caa7e227ce5113d8043cb206253e5dbe834c77f93c08454492831b2dc347c4bb8453491a597fcabb2e5a3e6c96505"

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
