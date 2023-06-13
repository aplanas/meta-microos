SUMMARY = "CPython bindings for libnest2d"
DESCRIPTION = "Binding allowing libnest2d to be called from Python using Numpy."
LICENSE = "LGPL-3.0-only"

PV = "4.12.0"

RPM_NAME = "python3-pynest2d-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "b7035b9ce6dd00176d810d3c18acdf1a3d1493a2d5ffd55b071107f790e3c43c51e726933ec8789b3a89873ac9e334b9d9d68e43cfa5b5b855572b38f2d923ff"

RPROVIDES:${PN} += "python3-pynest2d \
python3-pynest2d(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libnlopt.so.0()(64bit) \
libpolyclipping.so.22()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python3-qt5-sip"

inherit rpm
