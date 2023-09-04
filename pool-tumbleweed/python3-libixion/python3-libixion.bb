SUMMARY = "Python bindings for libixion"
DESCRIPTION = "Python 3 bindings for libixion."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "python3-libixion-0.18.1-1.1.aarch64.rpm"
RPM_HASH = "0aa6bfd501d11987b9c76efdee80ff2ae38f23724aa4bf7a768b4cd362260886588c47bad4ad78bfa9d9b35b342d641c1c92301c84ae000ea0fe970cd8e39e8b"

RPROVIDES:${PN} += "libixion-python3 \
python3-libixion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.18.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
