SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy_1_10_1-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "984640e45016dde2ba0aeda0f773b4165b47c1b49f846aa92799cac5e4dd2926aa2804842bf1d15177c5f2da9d9d73a83265a1085df81abd4fa8cf68de74232b"

RPROVIDES:${PN} += "python3.11dist-scipy \
python311-scipy-1-10-1-gnu-hpc \
python3dist-scipy"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libstdc++.so.6 \
python311-numpy-gnu-hpc"

inherit rpm
