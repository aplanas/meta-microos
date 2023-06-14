SUMMARY = "Cython wrapper for the Clipper library for clipping lines and polygons"
DESCRIPTION = "Pyclipper is a Cython wrapper exposing public functions and classes of \
the C++ translation of the `Angus Johnson's Clipper library`, a library \
for clipping and offsetting lines and polygons. \
 \
The Clipper library performs line & polygon clipping - intersection, \
union, difference & exclusive-or, and line & polygon offsetting. The \
library is based on Vatti's clipping algorithm."
LICENSE = "MIT"

PV = "1.3.0.post4"

RPM_NAME = "python311-pyclipper-1.3.0.post4-2.1.aarch64.rpm"
RPM_HASH = "860b82465aad34dcd1e06ee942a6039e9a901b8511d6b484d823b6ec33046984db6aff6bc7c21ae5507c8eebb30a394a9f30b5b51adab4c4ff661e42bfd7bc49"

RPROVIDES:${PN} += "python3.11dist-pyclipper \
python311-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
