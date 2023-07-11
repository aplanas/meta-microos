SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy_1_10_1-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "ae767a7f7f36dc3a55730b13fbfb9f00238f9f3d1060d537fb097906cc5c783be4161ec34dc689f6aa30b779800050ab14abb0a3c79a04ccd6e6b40c90a841aa"

RPROVIDES:${PN} += "python3.10dist-scipy \
python310-scipy-1-10-1-gnu-hpc \
python3dist-scipy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libstdc++.so.6 \
python310-numpy-gnu-hpc"

inherit rpm
