SUMMARY = "ODBC backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the ODBC backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-godbc-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "477b9314df68baba0f65df37f264486f665951ca05ad5548dda5951331622cf9ca3b4d6bd72853dcb268676caaed108f3657adf4996f0d7d06173e9eb9fb0817"

RPROVIDES:${PN} += "libgodbcbackend.so()(64bit) \
pdns-backend-godbc \
pdns-backend-godbc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libodbc.so.2()(64bit) \
libstdc++.so.6()(64bit) \
pdns"

inherit rpm
