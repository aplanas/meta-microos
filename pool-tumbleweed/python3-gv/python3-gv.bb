SUMMARY = "Python 3 Extension for Graphviz"
DESCRIPTION = "The package contains the Python extension for the \
graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "python3-gv-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "faddd999f7b71f220aa6b79fa0d5c52fbafa38b4c43ab4a32077216b9533ad5f6dc9f72332cdbb66208cfd771a10ee517c0864e2415164991fa4b57fc4813073"

RPROVIDES:${PN} += "libgv-python3.so \
python3-gv"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
