SUMMARY = "FreeRADIUS support for OpenLDAP"
DESCRIPTION = "FreeRADIUS schemas for OpenLDAP."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-schemas-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "18470299b4d9038317c425949ca22e03bb3ac0bf3b76884b3501f82bb1369217a3f47d8552badb51a140c8c323ce2491eafc1fc77358ac28bde2a2088071eb75"

RPROVIDES:${PN} += "config-freeradius-server-ldap-schemas \
freeradius-server-ldap-schemas"

RDEPENDS:${PN} += "openldap2"

inherit rpm
