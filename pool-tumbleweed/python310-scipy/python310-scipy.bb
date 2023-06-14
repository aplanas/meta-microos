SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "11c38fedbf2d172ed968612d89c12c5519fc5f90624df25026bdf8aa3f0c0caa646836c06c040407ba3e303ed91f16977e7e4698988a423ea45194bcd1819226"

RPROVIDES:${PN} += "python3-scipy \
python3.10dist-scipy \
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
