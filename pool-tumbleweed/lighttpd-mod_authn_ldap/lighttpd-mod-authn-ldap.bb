SUMMARY = "LDAP authentication in lighttpd"
DESCRIPTION = "A module to provide LDAP authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_ldap-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "f38e533384e5e155caabc76369cd4b9253afaab95cff4b52b028810535754952a6a617c9f9c8b57d26bc003267cd2de4f76e5beebffc0283cde5a47a3a90d896"

RPROVIDES:${PN} += "lighttpd-mod-authn-ldap"

RDEPENDS:${PN} += "libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lighttpd"

inherit rpm
