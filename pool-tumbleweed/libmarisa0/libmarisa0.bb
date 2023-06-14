SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "The libmarisa0 package contains runtime libraries for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "libmarisa0-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "0d017724cf017dd0f9186e32789081aa415ddea6e8929ffd5688738eab949c68f27454a92753c0d6a2c16e1794114f778eaf518ee317d3ea4c8ddd771c4899b7"

RPROVIDES:${PN} += "libmarisa.so.0 \
libmarisa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
