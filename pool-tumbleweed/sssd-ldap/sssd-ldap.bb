SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "Provides the LDAP back end that the SSSD can utilize to fetch \
identity data from and authenticate against an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-ldap-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "7c786a48b99cd3809350ee0da81be06ed030f4ea545768eac9688591967563ded5c274907f30bb5bc799567dd8e0dee86ca2f14a79fee9f97d59778e90b9f72f"

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
