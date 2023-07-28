SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-pgsql53-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "55d1bf565b17e16eea211115dc1582379ca2626c2e5b38805ec9dc37277b833767ca8d63a1e7c758ef32e7bad37907a328fda2a249ea2f7142fe49adeb9889bc"

RPROVIDES:${PN} += "libkea-pgsql.so.53 \
libkea-pgsql53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-database.so.48 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
