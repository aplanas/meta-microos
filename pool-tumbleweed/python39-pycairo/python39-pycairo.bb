SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python39-pycairo-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "27b6a4fa5629d7bfc08a84faf2cde0e55eeade464e3a5697ddf2813b145dae708c9c1281f5c0822fb89f066a21dc1f9dc079249ee97901440eb45a8bd5aaf522"

RPROVIDES:${PN} += "python3.9dist-pycairo \
python39-cairo \
python39-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
