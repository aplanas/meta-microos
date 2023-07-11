SUMMARY = "PostgreSQL plugin for tntdb"
DESCRIPTION = "PostgreSQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-postgresql-1.4-1.13.aarch64.rpm"
RPM_HASH = "3e013286d943bcf0216cd3e20cc0d9e8e4c93b56c3aa436ff0c6c734ec2bea5f74d2949b04ea6a74697422ceadd1beb4290217b45f675fd10a5409666aa4360c"

RPROVIDES:${PN} += "tntdb-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
