SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "python3-hawkey-0.70.2-1.1.aarch64.rpm"
RPM_HASH = "002bbab0583948073f84ee63833f59878169fc4f9d6649313856f7a2e192da6c03a5f72e9723a65105ebea89a4fe70ec062a0f573a74ee963673fb1394c03348"

RPROVIDES:${PN} += "python3-hawkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-libdnf"

inherit rpm
