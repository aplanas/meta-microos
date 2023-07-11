SUMMARY = "YaST2 - LDAP Agent"
DESCRIPTION = "This agent is used by various YaST2 modules to work with LDAP. It \
enables searching the LDAP tree and adding/deleting/modifying items on \
an LDAP server."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ldap-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "fd30e98491285023e311d1fd1306d75078e111fd420ebd3d00113d74bde805fd014a43e81cb54691ba7b4825f290e5a4545e3b2e16a88322d5f12639b5498921"

RPROVIDES:${PN} += "libpy2ag-ldap.so.2 \
perl-LdapServerAccess \
yast2-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
ldapcpplib \
libc.so.6 \
libgcc-s.so.1 \
liblber.so.2 \
libldapcpp.so.0 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2 \
yast2-network"

inherit rpm
