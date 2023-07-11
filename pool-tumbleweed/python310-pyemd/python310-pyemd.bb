SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-pyemd-0.5.1-4.6.aarch64.rpm"
RPM_HASH = "0d68760e573e36933a8fbe50fd78f534c8ecf45531a309c65f90a8370ab285d6b0fcd52b356bb740478c0550ee0da9aa82b3a0cce5f44f3fa851da48f145f661"

RPROVIDES:${PN} += "python3.10dist-pyemd \
python310-pyemd \
python3dist-pyemd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
