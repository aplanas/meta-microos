SUMMARY = "PostgreSQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the PostgresSQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbopostgres4_8_1-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "dcb1bf80758f70f4e061b79cce5f96923df67d18ec0aa2de3b85e356deb3650984a5cac98ae72eed40c41a99ca49fd875c448730f1ec1079f8305cb01696558d"

RPROVIDES:${PN} += "libwtdbopostgres.so.4.8.1()(64bit) \
libwtdbopostgres4_8_1 \
libwtdbopostgres4_8_1(aarch-64) \
wt-dbo-postgres"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libwtdbo.so.4.8.1()(64bit)"

inherit rpm
