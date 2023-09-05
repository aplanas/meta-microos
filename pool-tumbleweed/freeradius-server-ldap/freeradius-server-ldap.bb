SUMMARY = "LDAP support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing LDAP support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-ldap-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "29b428fd2d024147b658df20810f78c56ad6518c96b01f6a42dc1ffbef4e8fd0213bb1693cd095ef3112e1658474951023d4a6cfb5d4e000c107ade5b88d9733"

RPROVIDES:${PN} += "config-freeradius-server-ldap \
freeradius-server-ldap"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libldap.so.2"

inherit rpm
