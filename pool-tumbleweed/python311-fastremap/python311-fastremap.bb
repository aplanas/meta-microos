SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python311-fastremap-1.13.5-1.3.aarch64.rpm"
RPM_HASH = "51ba5ac6745d34926d52c66038e9cdfdc0c34f18bad39426d2798130b4a1a99753b4fe0524b23569f7af12e78dd1205130e7b443a1c4220f90b77a8f2e78dc07"

RPROVIDES:${PN} += "python3-fastremap \
python3.11dist-fastremap \
python311-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
