SUMMARY = "PostgreSQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the PostgreSQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-postgresql-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "c51c109f5b87f6be8bbf690d0954d6c3c54a5bc12a6c41075812b8bcc9a3cbd51ab9cc85076934b69976d2e6d2d4a1fc5392c322944632dbac870d315d1db562"

RPROVIDES:${PN} += "libgpgsqlbackend.so \
pdns-backend-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
pdns"

inherit rpm
