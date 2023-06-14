SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python311-slycot-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "4edcec70cf1f41ac1081c1300a023aafd2481884407edd89c46ec4787b2a02bd4dff3c4209f9f282e9771965787d758bbd63a784fbea79e95937d6db16e73c10"

RPROVIDES:${PN} += "python3.11dist-slycot \
python311-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python311-numpy"

inherit rpm
