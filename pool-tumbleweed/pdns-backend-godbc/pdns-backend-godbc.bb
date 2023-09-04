SUMMARY = "ODBC backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the ODBC backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-godbc-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "85f8728c145ed41877358cff77383b1a725bf71ebdd97e3f0a8721679095b80704b3440badfa4e05dc220433f5c60af2ffc5e5b4ae654f75adc6e80218631025"

RPROVIDES:${PN} += "libgodbcbackend.so \
pdns-backend-godbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libstdc++.so.6 \
pdns"

inherit rpm
