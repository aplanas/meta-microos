SUMMARY = "LDAP support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing LDAP support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "b95cb3f5dbea29b65a9242e94b2b46830e506fe3a03c921efcf5c321008d93c8fa78de64d009fee6d7ba665d7c5e190d359dbb939d226609602224be82305afd"

RPROVIDES:${PN} += "config(freeradius-server-ldap) \
freeradius-server-ldap \
freeradius-server-ldap(aarch-64)"
RDEPENDS:${PN} += "freeradius-server \
libc.so.6(GLIBC_2.17)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
