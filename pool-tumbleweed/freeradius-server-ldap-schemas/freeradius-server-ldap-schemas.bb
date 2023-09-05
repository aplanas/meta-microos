SUMMARY = "FreeRADIUS support for OpenLDAP"
DESCRIPTION = "FreeRADIUS schemas for OpenLDAP."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-ldap-schemas-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "3a6edba0c31d0e1deac5e3b7d6b4235fa95587f210ebcc32792b6cbe4f4c685a478ac1f498af9e43d3a1ef4bead10c2099cb5c85c9e7857bd1ebf39722dd1246"

RPROVIDES:${PN} += "config-freeradius-server-ldap-schemas \
freeradius-server-ldap-schemas"

RDEPENDS:${PN} += "openldap2"

inherit rpm
