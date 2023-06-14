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

RPM_NAME = "python39-fann2-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "dfa33f1a49e87469bd3e1b3df3c28092a6a8d8cfcc4d4507a9bb7487b2e4aee7d622a0a8b276cadc504457215761b7f5355efd24b00d99d2dec8490c89254be6"

RPROVIDES:${PN} += "python3.9dist-fann2 \
python39-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
