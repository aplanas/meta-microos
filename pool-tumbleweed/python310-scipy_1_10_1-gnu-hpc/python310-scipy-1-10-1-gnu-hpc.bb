SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy_1_10_1-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "815e39f975bc62a5d7757d8a7ec827e93c859eb32d5511e526b269de6b71dbc8617aebcc754f4bc7a0f98a6effde22db50f209e2c880d9f0e19472ee71b8e555"

RPROVIDES:${PN} += "python3-scipy_1_10_1-gnu-hpc \
python3.10dist(scipy) \
python310-scipy_1_10_1-gnu-hpc \
python310-scipy_1_10_1-gnu-hpc(aarch-64) \
python3dist(scipy)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libopenblas-gnu-hpc \
libstdc++.so.6()(64bit) \
python310-numpy-gnu-hpc"

inherit rpm
