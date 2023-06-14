SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "Provides the LDAP back end that the SSSD can utilize to fetch \
identity data from and authenticate against an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ldap-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "07811acb878d0ed915b66855e2581fb80ca49f996981d73690022050f640869c7f0576bfa36b0fce12825184245b6ea009cfd1bfec5dc76b706e46ef4be61bdf"

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
