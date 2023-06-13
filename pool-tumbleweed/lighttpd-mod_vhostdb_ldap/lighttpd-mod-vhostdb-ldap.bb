SUMMARY = "LDAP based virtual hosts module for Lighttpd"
DESCRIPTION = "With LDAP based vhosting you can put the information where to look for \
the document-root of a given host into an LDAP database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_ldap-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "0c899ffa9a4c914beee35aa333755a55fcc03576f387e817cabe8d0b33adf04d90ff4526970f63079be914746c6dfd58c750cbfadf6a79b21667ccf6017f4a4a"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_ldap \
lighttpd-mod_vhostdb_ldap(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
lighttpd"

inherit rpm
