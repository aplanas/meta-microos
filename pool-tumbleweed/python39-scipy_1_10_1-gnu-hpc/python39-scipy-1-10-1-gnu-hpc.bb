SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy_1_10_1-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "2317c55ef944a1e3e83126dacd83a0319d2e3b962d4d9ec449edd74d0aa96be133cb60c462d4dd9aacdad7118315941b11b640a81a1dff3bb4758f6846b771fc"

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
