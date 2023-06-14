SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-pgsql36-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "c91936dcc8a1afbd8883cbebaad6a23818f7ab0e62ceb7595b5d356e664f14ffe399e747a799037720d0700a539c70c5177d3263a4c665a784edb9b95c4c232f"

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
