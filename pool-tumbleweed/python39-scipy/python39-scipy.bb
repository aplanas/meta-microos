SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "afbb102f58f2e8a5b80dd507f1af12cf5858655bb4f69cafbb9834c06c1cec4933ed50debce2c4414511878e272be44b05638cbbe2efb10beaf8cf9eef0eaa5c"

RPROVIDES:${PN} += "python3.9dist-scipy \
python39-scipy \
python3dist-scipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-pybind11"

inherit rpm
