SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python39-scipy-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "2c76467ca30bc431653d091b25fe8695909fa9825d80fbf1ffbe5f8723532376d8980c9b466167d1d9577640d133a7ee0c36dac53e5e4a97507b6fded70d61cb"

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
