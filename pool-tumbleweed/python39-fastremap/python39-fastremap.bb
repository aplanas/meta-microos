SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python39-fastremap-1.13.5-1.1.aarch64.rpm"
RPM_HASH = "7c2e7dab2c2644cecd5fa15998e24b1dc1d210a6a3b777d494ad62019c4d994e74211d80e32f4b8dda770d500b78144fe56716e1cee3e8539eeae7c717e579c7"

RPROVIDES:${PN} += "python3.9dist(fastremap) \
python39-fastremap \
python39-fastremap(aarch-64) \
python3dist(fastremap)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
