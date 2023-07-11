SUMMARY = "LDAP support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing LDAP support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "94497b6f290216db9e9264732b6848ae5d8a9621af4a28bf89771a565c2c7873c3cf678cbb3f325808e0f25f8d79ce50ddbb89a5d163806d734c6c819125d82e"

RPROVIDES:${PN} += "config-freeradius-server-ldap \
freeradius-server-ldap"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libldap.so.2"

inherit rpm
