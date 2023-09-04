SUMMARY = "PostgreSQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the PostgreSQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-postgresql-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "43fd5a4d5478b3bb1366e77873db89af73157851f6f14020e185bab60e3e5b4f1d8a20b2cf9abd94e3b9881fadb08397e764c0f81bd131a8c419473caaf9dbc4"

RPROVIDES:${PN} += "libgpgsqlbackend.so \
pdns-backend-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
pdns"

inherit rpm
