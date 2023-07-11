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

RPM_NAME = "python311-fann2-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "988cf7286da6da86c273b8abd464a0f464f81d213db785881d16e2db8d9d4fbf218c492231493ea7de145d7659f4f6ed4d0afe5e1dcf564093b8ac1394a8bb21"

RPROVIDES:${PN} += "python3-fann2 \
python3.11dist-fann2 \
python311-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
