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

RPM_NAME = "python311-fann2-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "95363350b2c613ef0b95bd000951cc87c65db80f040b5581bcb984518e9577afb66ca2b38713189c4d53d158b97057aed6bf2545e10f8af6895090bb7fd7bbbb"

RPROVIDES:${PN} += "python3.11dist-fann2 \
python311-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
