SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "17831a82db84dda06e1082ce8dbfd24e9da95c15bec59354f474ab4feb801b94067251da8613fdf7bc6db6e6eab567b32baefc0c3ce17cc2bc3cbce11b87e851"

RPROVIDES:${PN} += "python3-scipy \
python3.11dist-scipy \
python311-scipy \
python3dist-scipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-pybind11"

inherit rpm
