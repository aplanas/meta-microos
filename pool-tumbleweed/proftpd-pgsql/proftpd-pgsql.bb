SUMMARY = "PostgreSQL Module for ProFTPD"
DESCRIPTION = "This is the PostgreSQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-pgsql-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "f1a1131d81a799d8f95b7bef9170cb69d43f7d3c7c0c36baba41a15ea3a1f228d98f9f766539a48625a751c525abdb9a23ed9f4a4d7b15232bbcb37146601f69"

RPROVIDES:${PN} += "proftpd-pgsql \
proftpd-pgsql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
proftpd"

inherit rpm
