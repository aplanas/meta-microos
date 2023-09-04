SUMMARY = "Lua backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the Lua backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-lua-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "8cf484f227419005927cf1221e65015ebf6df9cbb22e5e4135b03d6e0a34d10fa9e48c10a812352cd61bd6b4e38f74d4b2b5f3b6aae03060ea55ef032156802d"

RPROVIDES:${PN} += "liblua2backend.so \
pdns-backend-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
pdns"

inherit rpm
