SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "python3-hawkey-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "ecc3e92ae47f49ebe739e355b4cd398bdde5103e86dac779de7a1768d0c0e77f801d41430ca4813503dc12529e1ab0bc4c7d0a3c72be636c5b705091ac2e3b58"

RPROVIDES:${PN} += "python3-hawkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-libdnf"

inherit rpm
