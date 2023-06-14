SUMMARY = "YaST2 - LDAP Agent"
DESCRIPTION = "This agent is used by various YaST2 modules to work with LDAP. It \
enables searching the LDAP tree and adding/deleting/modifying items on \
an LDAP server."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ldap-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "5ecad06ed54fbb1392f5deb5410b3dee21f2c39e132048038d8f5786806eac8caa0b7b946fa0d7cf2ed1a3da9763c0ce5d4e362596d0c11368d9588f446b1256"

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
