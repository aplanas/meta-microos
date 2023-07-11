SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python310-slycot-0.5.4-1.2.aarch64.rpm"
RPM_HASH = "f1bb116d4f64bf79055448e0622b28013ea134308a8a863b2e12aefc99178b1f9390ab39f4befc47486214764edb30e4560b78fb682e4ec65b2d79c945a37fef"

RPROVIDES:${PN} += "python3.10dist-slycot \
python310-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python310-numpy"

inherit rpm
