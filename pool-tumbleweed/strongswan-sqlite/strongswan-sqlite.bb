SUMMARY = "SQLite plugin for strongSwan"
DESCRIPTION = "StrongSwan is an OpenSource IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan sqlite plugin."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-sqlite-5.9.11-2.1.aarch64.rpm"
RPM_HASH = "665ed7ef124328e0e354fdcbdf989d0eb15b189a80d9669964a48065737458fea625aba8e58df427a07b46e6d22e4dc7077c894bea4db9c4f0b1cefdfbe0d065"

RPROVIDES:${PN} += "config-strongswan-sqlite \
libstrongswan-sqlite.so \
strongswan-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
strongswan-libs0"

inherit rpm
