SUMMARY = "LDAP Module for ProFTPD"
DESCRIPTION = "This is the LDAP Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-ldap-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "b89211fecce54ce8c269053da3844b690ce4add9ede4e14c249a2741617a701e1e237563b03c87a0cf1868a75709f485c16875d9bb54a1d7c0c36f48b482c6dd"

RPROVIDES:${PN} += "proftpd-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
proftpd"

inherit rpm
