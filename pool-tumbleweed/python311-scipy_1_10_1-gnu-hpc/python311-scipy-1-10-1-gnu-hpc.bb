SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy_1_10_1-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "c717a1ba1d5ebd2aab94bec21b5adbd663dbbcd8e6d25e4372df0877c92fac099215c1c9ddbf14a71a7d6f205ea896612f0fd31d1421ee807e3946f313afba23"

RPROVIDES:${PN} += "python3-scipy-1-10-1-gnu-hpc \
python3.11dist-scipy \
python311-scipy-1-10-1-gnu-hpc \
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
