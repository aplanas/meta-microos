SUMMARY = "Lua backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the Lua backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-lua-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "f13ce513345fa7e5d0bfdfb96b97fc8e1dc7813a916436a22a24fa10f10452d93f331feab7c2d9e5eb29be6cd4ebf94a535c520841ff3e68a075dbdd6fdc8745"

RPROVIDES:${PN} += "liblua2backend.so \
pdns-backend-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
pdns"

inherit rpm
