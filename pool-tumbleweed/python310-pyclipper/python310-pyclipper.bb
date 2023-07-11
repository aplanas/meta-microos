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

RPM_NAME = "python310-pyclipper-1.3.0.post4-2.3.aarch64.rpm"
RPM_HASH = "b755f4703582d0c9e54f710bd972bd18d1ee1c0009d19ff378def7382b81809bf8bc4a73bf05d1a766d05f6ea4dd1440348b0ddbe25b8dc8df72dc58c212d0eb"

RPROVIDES:${PN} += "python3.10dist-pyclipper \
python310-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
