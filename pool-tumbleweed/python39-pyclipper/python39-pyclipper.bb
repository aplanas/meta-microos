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

RPM_NAME = "python39-pyclipper-1.3.0.post4-2.3.aarch64.rpm"
RPM_HASH = "d1905aa579b6f1bf8f3ab9d89786507e4713a116637c922e6d0d8aae517e8d71df5e519928a9515bac9d6e74eeb551ddc35812dfe35070b4e646bcba3c7c92c1"

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
