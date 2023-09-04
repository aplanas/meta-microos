SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python39-scipy_1_11_1-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "fc87fe2f2d3653886a52381939d93915e1f349df6d4c5577475137d6ffb1400ec9d46a4985cfae1cb6fa9b5dccb10dd6bb28cc06f001b390ed67c35c4662f974"

RPROVIDES:${PN} += "python3.9dist-scipy \
python39-scipy-1-11-1-gnu-hpc \
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
