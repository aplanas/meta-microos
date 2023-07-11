SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-pyemd-0.5.1-4.6.aarch64.rpm"
RPM_HASH = "7a541d4606e5dfcd63e7b33647a8d7d817f7ac2cebc9b876d4f1ad093443671182562609210a50e038637779dc98f54a438f4c07a42f0e5c9861e4c53a9ab87b"

RPROVIDES:${PN} += "python3.9dist-pyemd \
python39-pyemd \
python3dist-pyemd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
