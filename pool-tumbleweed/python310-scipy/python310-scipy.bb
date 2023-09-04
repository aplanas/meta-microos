SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python310-scipy-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "f96d17780db8b16b887e59c2ce42c03ad3a27b233a4916ee7d58bef041bb7c1a6d23360426d5b66d4e98221cf38c0d4026dbc32cacb99cbbfcc3551390c80c80"

RPROVIDES:${PN} += "python3.10dist-scipy \
python310-scipy \
python3dist-scipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-pybind11"

inherit rpm
