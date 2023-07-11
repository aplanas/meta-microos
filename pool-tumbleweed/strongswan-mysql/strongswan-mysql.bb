SUMMARY = "MySQL plugin for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan mysql plugin."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-mysql-5.9.11-2.1.aarch64.rpm"
RPM_HASH = "6ff41ad424c6e844bfc0b04f949622e775d8894d0ef497bca62e4e8376221e8707dfa1e420210e1497f7e358c1e89ff22f3ebe35ec9e9ea8a432dc5da899b133"

RPROVIDES:${PN} += "config-strongswan-mysql \
libstrongswan-mysql.so \
strongswan-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
strongswan-libs0"

inherit rpm
