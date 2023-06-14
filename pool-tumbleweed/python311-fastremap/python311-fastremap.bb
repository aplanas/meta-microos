SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python311-fastremap-1.13.5-1.1.aarch64.rpm"
RPM_HASH = "8e1ac57bd248e656b2d9026f133d5166ef0fbb2baadb631a4fadd32b40b07b3a203e105f7a4704b0d152073e690aba65d7ef6656750f3e2da1ab01d328097aa7"

RPROVIDES:${PN} += "python3.11dist-fastremap \
python311-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
