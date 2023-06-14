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

RPM_NAME = "python310-pyclipper-1.3.0.post4-2.1.aarch64.rpm"
RPM_HASH = "9506f36ae8cbf71e6abc53aaa16f1ca03d601afc7f6ee0c11bedbc46771a85fd818c5910de69c870df9a28439c6d4f4e21445fbe98eb8e8e0643c003806c21a6"

RPROVIDES:${PN} += "python3-pyclipper \
python3.10dist-pyclipper \
python310-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
