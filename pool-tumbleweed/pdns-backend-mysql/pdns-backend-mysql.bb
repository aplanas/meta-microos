SUMMARY = "MySQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the MySQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-mysql-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "be4a28a2b694ad30505e8bc18810fb414ad4a9f4bed30530c263fc04fceca8b77dfd916e860e1028d6d0ca2faeb40cbddf7eecc1a4d41028665c09481a06a7b9"

RPROVIDES:${PN} += "libgmysqlbackend.so \
pdns-backend-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
pdns"

inherit rpm
