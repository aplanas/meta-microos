SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "93edea3c488b9780ad0662779693f0da42f0882f2b9ceb3363e7ab9795a528aea097e1fc18e3049df8c65c1a756b040b9a7d1b269fe885b401cc9c29ba58a553"

RPROVIDES:${PN} += "python3.9dist(scipy) \
python39-scipy \
python39-scipy(aarch-64) \
python3dist(scipy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy \
python39-pybind11"

inherit rpm
