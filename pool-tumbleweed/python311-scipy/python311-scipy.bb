SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "b1d5cb5f8dda36e2c2e5905f9a7845fff36e96f1ff0d19333c75b17ec17069829fe85a4c515ef71066115651e548754b3f9a579b72859b6bb45d6a127fd0c0d1"

RPROVIDES:${PN} += "python3.11dist-scipy \
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
