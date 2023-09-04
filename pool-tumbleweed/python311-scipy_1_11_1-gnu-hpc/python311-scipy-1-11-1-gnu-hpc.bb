SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python311-scipy_1_11_1-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "8318a7433a4d6c33f2754a3113afec0247c30489b8c2cabd80e5ad637ac67b4e82440966a4c59bdd213c52147eeda5c0b8d3b984bba4b7dee30c5f82b0d7a72b"

RPROVIDES:${PN} += "python3-scipy-1-11-1-gnu-hpc \
python3.11dist-scipy \
python311-scipy-1-11-1-gnu-hpc \
python3dist-scipy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libstdc++.so.6 \
python311-numpy-gnu-hpc"

inherit rpm
