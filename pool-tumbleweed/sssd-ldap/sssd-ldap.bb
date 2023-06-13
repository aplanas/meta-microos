SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "Provides the LDAP back end that the SSSD can utilize to fetch \
identity data from and authenticate against an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ldap-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "07811acb878d0ed915b66855e2581fb80ca49f996981d73690022050f640869c7f0576bfa36b0fce12825184245b6ea009cfd1bfec5dc76b706e46ef4be61bdf"

RPROVIDES:${PN} += "libsss_ldap.so()(64bit) \
libsss_ldap_common.so()(64bit) \
sssd-ldap \
sssd-ldap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdhash.so.1()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libldb.so.2()(64bit) \
libsss_cert.so()(64bit) \
libsss_certmap.so.0()(64bit) \
libsss_child.so()(64bit) \
libsss_crypt.so()(64bit) \
libsss_debug.so()(64bit) \
libsss_idmap.so.0()(64bit) \
libsss_krb5_common.so()(64bit) \
libsss_util.so()(64bit) \
libtalloc.so.2()(64bit) \
libtevent.so.0()(64bit) \
sssd-krb5-common"

inherit rpm
