SUMMARY = "FreeIPA backend plugin for sssd"
DESCRIPTION = "Provides the IPA back end that the SSSD can utilize to fetch identity \
data from and authenticate against an IPA server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-ipa-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "6f2bb9c6fad1bdb04ba9086ffe5353962e049a7a9f29cb2080f6af9ddef7cc3bcc03ae521dbce433408cda4ed8571313ea086dc1291529e30e382cb4b93149f4"

RPROVIDES:${PN} += "libsss-ipa.so \
sssd-ipa \
sssd-ipa-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libipa-hbac.so.0 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.3 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0 \
sssd \
sssd-ad \
sssd-krb5-common"

inherit rpm
