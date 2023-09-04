SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python310-scipy_1_11_1-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "76fc9e2eb99174af05ce5a5415b8d83825c76b059a9eb11d05dc95a3709ac0e2f45ddd9a8d6ecee59ce1acf7a9d304951aba0e7dcaead738e8d278d400988729"

RPROVIDES:${PN} += "python3.10dist-scipy \
python310-scipy-1-11-1-gnu-hpc \
python3dist-scipy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libstdc++.so.6 \
python310-numpy-gnu-hpc"

inherit rpm
