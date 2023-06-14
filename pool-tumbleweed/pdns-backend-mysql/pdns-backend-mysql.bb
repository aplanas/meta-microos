SUMMARY = "MySQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the MySQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-mysql-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "1ffcc47e95a6019b68b617f76524b2a72760fbd9e322479e30ad41526bf179e169879a37d1ad82307f42aef767b3fe6083edaefded16ea4bcf5d42e938e7e34e"

RPROVIDES:${PN} += "libgmysqlbackend.so \
pdns-backend-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
pdns"

inherit rpm
