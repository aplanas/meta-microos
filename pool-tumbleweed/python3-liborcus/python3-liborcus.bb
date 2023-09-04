SUMMARY = "Python bindings for liborcus"
DESCRIPTION = "Python 3 bindings for liborcus."
LICENSE = "MPL-2.0"

PV = "0.18.1"

RPM_NAME = "python3-liborcus-0.18.1-3.1.aarch64.rpm"
RPM_HASH = "6ad8feaea42c21da8477476e82a224121135e0310aea3994c36c24813ec391a8c7aa68789126dce6874fdf5dbd3d91e9900dc093ca4330f0ff9636e9d31cd0cb"

RPROVIDES:${PN} += "liborcus-python3 \
python3-liborcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.18.so.0 \
liborcus-0.18.so.0 \
liborcus-parser-0.18.so.0 \
liborcus-spreadsheet-model-0.18.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
