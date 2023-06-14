SUMMARY = "MySQL plugin for tntdb"
DESCRIPTION = "MySQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-mysql-1.4-1.12.aarch64.rpm"
RPM_HASH = "849873e199dcd02481c8e1b9a690a8ae68f2e09b1cb67d2cb7ee2721b5a0bb6343f434a8756b2bf331c021fd749d3433e02dab9e8d086a1ff5c1ce90ade272fb"

RPROVIDES:${PN} += "tntdb-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
