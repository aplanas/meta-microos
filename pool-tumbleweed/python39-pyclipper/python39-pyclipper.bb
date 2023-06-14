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

RPM_NAME = "python39-pyclipper-1.3.0.post4-2.1.aarch64.rpm"
RPM_HASH = "b95fa2287e1f73b2818c73e29125dd03a1f7f3facc4018e0afb677a1c3c588f6ff0871b161343390bef2afd0ab79524a09df756eacf9d10d6abbf7dd2de80cf8"

RPROVIDES:${PN} += "python3.9dist-pyclipper \
python39-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
