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

RPM_NAME = "python311-pyclipper-1.3.0.post4-2.3.aarch64.rpm"
RPM_HASH = "e8934450bd21b56634ec72fb80d1baf4b9077249d35bdf52f439812c58b72749762b4cc82c049a256dbd6dd880c1461529eca8e2307c4aec987a3095ba2659b1"

RPROVIDES:${PN} += "python3-pyclipper \
python3.11dist-pyclipper \
python311-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
