SUMMARY = "The ActiveDirectory backend plugin for sssd"
DESCRIPTION = "Provides the Active Directory back end that the SSSD can utilize to \
fetch identity data from and authenticate against an Active Directory \
server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-ad-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "82855117ece87abcab6a1ac59eaa851d59d96c8e6c0aff674d42f175d49ff4a43a2e24f0b0c4d7edb08cc5a3ba0d7507ebca956dff968540187f5463abecd9b2"

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
