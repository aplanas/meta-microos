SUMMARY = "MySQL plugin for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan mysql plugin."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-mysql-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "49f911cc76ed7a65f2fec441579d8eeb0906547a8fb10f834a8cd642d7128565962b22a47c08a6ac84479777c1ee9c67cc37e476bab000ebbb5a5944ebcbe832"

RPROVIDES:${PN} += "config-strongswan-mysql \
libstrongswan-mysql.so \
strongswan-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
strongswan-libs0"

inherit rpm
