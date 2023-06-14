SUMMARY = "PostgreSQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the PostgresSQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbopostgres4_8_1-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "dcb1bf80758f70f4e061b79cce5f96923df67d18ec0aa2de3b85e356deb3650984a5cac98ae72eed40c41a99ca49fd875c448730f1ec1079f8305cb01696558d"

RPROVIDES:${PN} += "libwtdbopostgres.so.4.8.1 \
libwtdbopostgres4-8-1 \
wt-dbo-postgres"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpq.so.5 \
libstdc++.so.6 \
libwtdbo.so.4.8.1"

inherit rpm
