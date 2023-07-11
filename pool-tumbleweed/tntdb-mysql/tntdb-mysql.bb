SUMMARY = "MySQL plugin for tntdb"
DESCRIPTION = "MySQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-mysql-1.4-1.13.aarch64.rpm"
RPM_HASH = "1e777725f53de50aa0a4b2b00d060043636d06a2dfa9f71ef67a93882922ab40cb7d3207ca8bd780879f8e862570a1ca95e5ad365d0da455ed2004f61dbda213"

RPROVIDES:${PN} += "tntdb-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
