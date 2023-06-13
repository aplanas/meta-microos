SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python310-fastremap-1.13.5-1.1.aarch64.rpm"
RPM_HASH = "db1b0298af0d3a2a0c337753406f99ced38d41ea3073ac8cc40d96ea1af9450a600c3615286a5e874e0701f1a22a7ec653c59a690dbfea24c084c0b6c36f0ad0"

RPROVIDES:${PN} += "python3-fastremap \
python3.10dist(fastremap) \
python310-fastremap \
python310-fastremap(aarch-64) \
python3dist(fastremap)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
