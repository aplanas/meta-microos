SUMMARY = "The ActiveDirectory backend plugin for sssd"
DESCRIPTION = "Provides the Active Directory back end that the SSSD can utilize to \
fetch identity data from and authenticate against an Active Directory \
server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ad-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "1193aab54fedbc5d544e150b09d117a16ce89b8bc954401655f382b41954d2dd433456f7860534b02ea5b2ccaecb1774a77c583662db03c5f92c3ca07c3c1ec3"

RPROVIDES:${PN} += "libsss-ad.so \
sssd-ad"

RDEPENDS:${PN} += "adcli \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libini-config.so.5 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.3 \
libpopt.so.0 \
libsasl2.so.3 \
libselinux.so.1 \
libsmbclient.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-iface.so \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-sbus.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
sssd-krb5-common"

inherit rpm
