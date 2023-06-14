SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-pyemd-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "ef62358ce1b32b33c02f863c6db9000ce05a8bc91de15cded0e00e261bbe3f8a77980d1cf90bac57d84ddaac76c00d89e70d9711fc75b1e4f19f87b8515ad19e"

RPROVIDES:${PN} += "python3-pyemd \
python3.10dist-pyemd \
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
