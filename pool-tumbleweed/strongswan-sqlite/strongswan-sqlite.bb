SUMMARY = "SQLite plugin for strongSwan"
DESCRIPTION = "StrongSwan is an OpenSource IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan sqlite plugin."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-sqlite-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "42e5018bc0605bdc4c73c4ef6fa0b96d32e98de339b5b36255ab4cfa9f7955fc28f4dc5c43560416eef71981572b4deba19be9fea0cd952a3947cbd5179a4461"

RPROVIDES:${PN} += "config(strongswan-sqlite) \
libstrongswan-sqlite.so()(64bit) \
strongswan-sqlite \
strongswan-sqlite(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
strongswan-libs0"

inherit rpm
