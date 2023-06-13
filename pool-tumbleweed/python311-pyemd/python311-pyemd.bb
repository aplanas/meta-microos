SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-pyemd-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "4995e0161f3b81cc032eb57c175c3acec5ae7b35ccc9a7ecacc905671ba99f23e3ea697b088c84d040ee1292dfae96cb4ab2a5603b41989bcaabc38f8e978e07"

RPROVIDES:${PN} += "python3.11dist(pyemd) \
python311-pyemd \
python311-pyemd(aarch-64) \
python3dist(pyemd)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
