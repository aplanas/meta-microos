SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "python3-hawkey-0.70.1-1.2.aarch64.rpm"
RPM_HASH = "31a4216373d21681983b8e271ee3ca1dbcb1711fc8a15f8655c3b946a77e117376131a6632bbb81c7b01b963d1f49674f08d8ce676d96dea16055cd7262fdc21"

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
