SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-pgsql36-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "c91936dcc8a1afbd8883cbebaad6a23818f7ab0e62ceb7595b5d356e664f14ffe399e747a799037720d0700a539c70c5177d3263a4c665a784edb9b95c4c232f"

RPROVIDES:${PN} += "libkea-pgsql.so.36()(64bit) \
libkea-pgsql36 \
libkea-pgsql36(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-database.so.35()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
