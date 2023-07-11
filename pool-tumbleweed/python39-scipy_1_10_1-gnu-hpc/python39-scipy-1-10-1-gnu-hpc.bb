SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy_1_10_1-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "3831b9dab26c9f880eea58926655ba5cb3a8caab67485d41b5c132e8a7bdaac38d31f0002653f45118590d6a52c8b671caa4b561ea2fca47d4fb5f1a95cc5279"

RPROVIDES:${PN} += "python3.9dist-scipy \
python39-scipy-1-10-1-gnu-hpc \
python3dist-scipy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libstdc++.so.6 \
python39-numpy-gnu-hpc"

inherit rpm
