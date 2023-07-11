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

RPM_NAME = "python310-fann2-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "a660308e3bca1bebf1bdee7b82f7c65a04dc5f923557f330ae4ff94c4d8ccf2666713df12e7597f1659f7ad1f9d61db9b3221a127cecafa5a38dd7513deaa78c"

RPROVIDES:${PN} += "python3.10dist-fann2 \
python310-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
