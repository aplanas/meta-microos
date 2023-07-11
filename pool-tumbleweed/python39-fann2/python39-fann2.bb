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

RPM_NAME = "python39-fann2-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "121be2593aa421363dc104c7863d479482329f3d7e17d2b72b3c53418de037a5cbe223574b30aa9baddf3a2632294504d42f0e8dfa0e5216d677d390c2c65981"

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
