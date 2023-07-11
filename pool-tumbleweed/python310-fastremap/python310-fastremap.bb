SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python310-fastremap-1.13.5-1.3.aarch64.rpm"
RPM_HASH = "734617eb338ee11f31bcc8ae0888a84e22f1aad5a64eca6ecdc1e7778eca76f9379dd1cc1e21b7213080bd6fd3f440f9c43c28edf155c61b443244dab645a240"

RPROVIDES:${PN} += "python3.10dist-fastremap \
python310-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
