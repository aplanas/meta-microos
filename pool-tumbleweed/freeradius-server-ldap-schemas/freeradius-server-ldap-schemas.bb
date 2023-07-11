SUMMARY = "FreeRADIUS support for OpenLDAP"
DESCRIPTION = "FreeRADIUS schemas for OpenLDAP."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-schemas-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "5a076ae25df630cf626f7de08c602f33bf3f2125a20ea974eec7e25bf185331739de2ddb1a8211cf75d48890734c9291a9f7d3b6a3ae1068898c8daf5927213b"

RPROVIDES:${PN} += "config-freeradius-server-ldap-schemas \
freeradius-server-ldap-schemas"

RDEPENDS:${PN} += "openldap2"

inherit rpm
