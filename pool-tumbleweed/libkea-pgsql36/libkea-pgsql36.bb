SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-pgsql36-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "25bd45fc50820c96a4e342d4ce720ae357c338bee8c71a892bb9bd27e102eae5887e5559df4495748dab3f6f86d05538976eab9e66f933352a059f9b0327ca86"

RPROVIDES:${PN} += "libkea-pgsql.so.36 \
libkea-pgsql36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-database.so.35 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
