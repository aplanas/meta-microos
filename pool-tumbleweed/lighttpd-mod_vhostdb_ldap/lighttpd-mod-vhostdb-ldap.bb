SUMMARY = "LDAP based virtual hosts module for Lighttpd"
DESCRIPTION = "With LDAP based vhosting you can put the information where to look for \
the document-root of a given host into an LDAP database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_ldap-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "01cdc6ba6970534577d9e8689b1bb90d121663c23118f7132d3b0874dfc5228d3102692948f461ecddd9c36b3a5e5f6af63529fb948ebeed9e7fb14934e7ba2b"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-ldap"

RDEPENDS:${PN} += "libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lighttpd"

inherit rpm
