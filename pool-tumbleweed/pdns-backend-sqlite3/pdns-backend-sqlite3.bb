SUMMARY = "SQLite 3 backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the SQLite 3 backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-sqlite3-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "e3975ec21071be000b1343c0ef8894627ea09cf9605ed7c9f8d86b55f1d5c80a15c40061477c584a66df64fc9c508da4cc853fd0d5fe4e11938ef3a5d1a30f9e"

RPROVIDES:${PN} += "libgsqlite3backend.so \
pdns-backend-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pdns"

inherit rpm
