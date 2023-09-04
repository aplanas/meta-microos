SUMMARY = "FreeRADIUS support for OpenLDAP"
DESCRIPTION = "FreeRADIUS schemas for OpenLDAP."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-ldap-schemas-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "5111a67f3fb835c934e7f26567ee41ef2937a78f9cd3bdfcd53074af753d855266be8f4f2ec73886228940579b1ad3fc0978a2dfc75f70a822dc3f333e312433"

RPROVIDES:${PN} += "config-freeradius-server-ldap-schemas \
freeradius-server-ldap-schemas"

RDEPENDS:${PN} += "openldap2"

inherit rpm
