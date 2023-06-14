SUMMARY = "SQLite 3 backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the SQLite 3 backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-sqlite3-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "df5e99cecd03489dc61200575920323c6bd2196e2efc159d75140b81fd77cfadfdd815f61d2b9a3b19444e80a567420e80ecf4edcd1d63e9ec50479e918ef7c7"

RPROVIDES:${PN} += "libgsqlite3backend.so \
pdns-backend-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pdns"

inherit rpm
