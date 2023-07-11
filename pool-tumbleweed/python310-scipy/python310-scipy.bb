SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "664bcac4269e4f3434eb6fd2ea90c9eb5066b7d2d811af83fec9d7406c3387cbcc1ecf1e1a535881f9a2616b6ece623eac972c25e978c5960df82ab2a772e20e"

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
