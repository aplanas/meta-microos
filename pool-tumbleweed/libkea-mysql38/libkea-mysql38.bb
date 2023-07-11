SUMMARY = "Kea MySQL database library"
DESCRIPTION = "Kea's database library for MySQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-mysql38-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "4b08a3431ab14c62ddf8a75ad6fb075ca03c0a68be5d6b28a5a2b3d9e0a71a5bf31194bc3cd0e9d9c41f1fbaf08c8945fa616e744a5ad952db2ef772299052eb"

RPROVIDES:${PN} += "libkea-mysql.so.38 \
libkea-mysql38"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-database.so.35 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-util.so.52 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
