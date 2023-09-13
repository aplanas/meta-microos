SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "Provides the LDAP back end that the SSSD can utilize to fetch \
identity data from and authenticate against an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-ldap-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "f21ac42304a16644d4cee59629c81ae5b386fcda35b53a5e451f0cb27e8ca8816dbeba317c3e24953fac95c4cbc062b64af163444bff4dbbf269792816ec1ec6"

RPROVIDES:${PN} += "libsss-ldap-common.so \
libsss-ldap.so \
sssd-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libsss-cert.so \
libsss-certmap.so.0 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-krb5-common.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0 \
sssd-krb5-common"

inherit rpm
