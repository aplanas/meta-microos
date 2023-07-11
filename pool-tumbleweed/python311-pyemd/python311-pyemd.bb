SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-pyemd-0.5.1-4.6.aarch64.rpm"
RPM_HASH = "d60c460cc6dede66a073aa6a2d207141b0fcc02b41af22e685ed06ec5417b3dfa61bba85e6c6fa8b53d5215f87dc3a715f59518a01bcfa04f80f30059544fd55"

RPROVIDES:${PN} += "python3-pyemd \
python3.11dist-pyemd \
python311-pyemd \
python3dist-pyemd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
