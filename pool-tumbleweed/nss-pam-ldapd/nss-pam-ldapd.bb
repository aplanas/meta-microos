SUMMARY = "NSS module and daemon for using LDAP as a naming service"
DESCRIPTION = "This is nss-pam-ldapd which provides a Name Service Switch (NSS) \
module that allows your LDAP server to provide user account, group, \
host name, alias, netgroup, and basically any other information that \
you would normally get from /etc flat files or NIS. It also provides a \
Pluggable Authentication Module (PAM) to do authentication to an LDAP \
server. \
 \
This is implemented using thin NSS and PAM modules which delegate to a \
dedicated service (nslcd) that queries the LDAP server with persistent \
connections, authentication, attribute translation, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.12"

RPM_NAME = "nss-pam-ldapd-0.9.12-1.9.aarch64.rpm"
RPM_HASH = "ca103d33b3a0eaa89692917c3e23133566fef1c84c98be8d9c91d2f26c1c4205e93f7bd07c2659068ece97be04abbe6a5c7daff9a75a0965c0a60fcf27875ea5"

RPROVIDES:${PN} += "config-nss-pam-ldapd \
libnss-ldap.so.2 \
nss-ldapd \
nss-pam-ldapd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
shadow"

inherit rpm
