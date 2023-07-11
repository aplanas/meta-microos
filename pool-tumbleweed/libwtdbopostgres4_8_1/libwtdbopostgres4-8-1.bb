SUMMARY = "PostgreSQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the PostgresSQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbopostgres4_8_1-4.8.1-3.8.aarch64.rpm"
RPM_HASH = "18333096a16811b76ec4a237bf4ed162ed9773c4285eb0d8c38fbfe226c9ed093aecf3a9debefedffc1431cd0813bd6b2b3fbbaefbac94f95fa5a361e6a3d836"

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
