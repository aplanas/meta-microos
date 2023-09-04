SUMMARY = "LDAP support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing LDAP support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "90302356b904173cdc26a1d9e8d7968c3a922dd66061405a4ade80bc8eac495c97c014eaa05f199c2d9bfcf9869d3a0ed714c80ae2dadbe87e91cac156859868"

RPROVIDES:${PN} += "config-freeradius-server-ldap \
freeradius-server-ldap"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libldap.so.2"

inherit rpm
