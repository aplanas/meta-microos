SUMMARY = "Fast Artificial Neural Network Library (fann) bindings"
DESCRIPTION = "Python bindings for Fast Artificial Neural Networks 2.2.0 (FANN >= 2.2.0) \
that implements multilayer artificial neural networks with support for both \
fully-connected and sparsely-connected networks. It includes a framework \
for easy handling of training data sets. \
 \
These are the original python bindings included with FANN 2.1.0beta and \
updated to include support for python 2.x/3.x ."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "python310-fann2-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "0fa4160351c2b6231f7a772fca312c0698b39e7289e05c2c782796691112beee48c4c258c7a3a6aab89708a064d2b9ad3feac61d3c487556be762aed6408f69c"

RPROVIDES:${PN} += "python3-fann2 \
python3.10dist-fann2 \
python310-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
