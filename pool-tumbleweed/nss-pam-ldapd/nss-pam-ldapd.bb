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

RPM_NAME = "nss-pam-ldapd-0.9.12-1.8.aarch64.rpm"
RPM_HASH = "84b6496d4c03eff457f7c92bcf11ec0a4eb3baa33686cc337bb98ccf808cc75f956a5e10e6b74d3b573859faf75d8723c808a3b85937862bd8e402f79e0595c7"

RPROVIDES:${PN} += "config(nss-pam-ldapd) \
libnss_ldap.so.2()(64bit) \
libnss_ldap.so.2(EXPORTED)(64bit) \
nss-ldapd \
nss-pam-ldapd \
nss-pam-ldapd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.1)(64bit) \
shadow"

inherit rpm
